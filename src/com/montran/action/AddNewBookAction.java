package com.montran.action;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.montran.dao.BookDAO;
import com.montran.form.GetDetailsForm;
import com.montran.pojo.Book_issue_return_pojo;
import com.montran.pojo.Book_pojo;
import com.montran.pojo.Member_Pojo;

public class AddNewBookAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println(" in add new book action");
		GetDetailsForm getdetails=(GetDetailsForm) form;
		
		Member_Pojo member=null;
		Book_pojo book=null;
		Book_issue_return_pojo issueDetails=null;
		BookDAO adddao=new BookDAO();
		
		
		if (request.getParameter("member") != null) {
			if(request.getParameter("member").equals("GetMember"))
			{
				
				System.out.println(getdetails.getMember_code());
				member = adddao.getMemberByMemberCode(getdetails.getMember_code());
				getdetails.setName(member.getName());
				return mapping.findForward("book");
			}
		}//end of if for member
		
		if (request.getParameter("book") != null) {				//for getting bookname
			if(request.getParameter("book").equals("GetBook"))
			{
				
				System.out.println(getdetails.getBook_code());
				book =adddao.getBookByBookCode(getdetails.getBook_code());
				getdetails.setAuthor(book.getAuthor());
				getdetails.setTitle(book.getTitle());
				
				LocalDate issueDate = LocalDate.now();
				LocalDate returnDate = LocalDate.now();
				
				member = adddao.getMemberByMemberCode(getdetails.getMember_code());
				getdetails.setName(member.getName());

				if (member.getMember_type().equals("S")) {
					returnDate = returnDate.plusDays(10);
					System.out.println(getdetails);
				}
				if (member.getMember_type().equals("F")) {
					returnDate = returnDate.plusDays(90);
					System.out.println(getdetails);
				}

				getdetails.setIssue_date(issueDate.toString());
				getdetails.setReturn_date(returnDate.toString());
				
				
				HttpSession httpSession = request.getSession();

				httpSession.setAttribute("member", member);
				httpSession.setAttribute("book", book);
				httpSession.setAttribute("issueDate", issueDate);
				httpSession.setAttribute("returnDate", returnDate);
				
				
				return mapping.findForward("member");
			}//end of if
			
			
			
		}//end of if for book
		
		if (request.getParameter("issue") != null) {
			if (request.getParameter("issue").equals("issueBook")) {
				
				HttpSession httpSession = request.getSession();
				LocalDate issueDate = null;
				LocalDate returnDate = null;

				if (httpSession.getAttribute("book") != null)
					book = (Book_pojo) httpSession.getAttribute("book");
				if (httpSession.getAttribute("member") != null)
					member = (Member_Pojo) httpSession.getAttribute("member");
				if (httpSession.getAttribute("issueDate") != null)
					issueDate = (LocalDate) httpSession.getAttribute("issueDate");
				if (httpSession.getAttribute("returnDate") != null)
					returnDate = (LocalDate) httpSession.getAttribute("returnDate");

				
				Date issueD = Date.from(issueDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
				Date returnD = Date.from(returnDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
				Random rand=new Random();
				issueDetails = new Book_issue_return_pojo(rand.nextInt(1000), member,book,issueD,returnD);
				if(book.getStatus().equals("A"))
				{
					
					adddao.issueNewBook(issueDetails);
					System.out.println("Book Issued Successfully !!");
				}
				else
				{
					System.out.println("Book cannot be issued");
				}
				
				
				
				
			}
		}// end of if for issue
		return mapping.findForward("success");
}

}