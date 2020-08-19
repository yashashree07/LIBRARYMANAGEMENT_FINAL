package com.montran.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.montran.dao.BookDAO;
import com.montran.pojo.Book_issue_return_pojo;
import com.montran.pojo.Member_Pojo;


public class BookAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("in bookaction");
		BookDAO dao=new BookDAO();
		List<Book_issue_return_pojo> bookList=dao.getAllBooks();
		
		request.setAttribute("books",bookList);
		
		return mapping.findForward("success");
		
	}

}
