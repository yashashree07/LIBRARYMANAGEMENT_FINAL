package com.montran.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.montran.dao.BookDAO;
import com.montran.form.AddNewBookForm;
import com.montran.form.GetDetailsForm;
import com.montran.pojo.Book_issue_return_pojo;
import com.montran.pojo.Book_pojo;
import com.montran.pojo.Member_Pojo;

public class DeleteBookAction extends Action{

		
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("in deletebook action");
		
		Member_Pojo member=null;
		Book_pojo book=null;
		Book_issue_return_pojo bookIssueReturn=null;
		BookDAO dao=new BookDAO();
		GetDetailsForm detailsForm=(GetDetailsForm) form;
		
		String membercode=detailsForm.getMember_code();
		String bookcode=detailsForm.getBook_code();
		
		member=dao.getMemberByMemberCode(detailsForm.getMember_code());
		book=dao.getBookByBookCode(detailsForm.getBook_code());
		
		System.out.println(member);
		
		if(member.getMember_code().equals(membercode) && book.getBook_code().equals(bookcode))
		{
			dao.deleteData(bookIssueReturn);
		}
			
		return mapping.findForward("success");
	}
}
