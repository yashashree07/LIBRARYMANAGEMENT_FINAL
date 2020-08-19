package com.montran.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.montran.dao.BookDAO;
import com.montran.pojo.Book_issue_return_pojo;

public class IssueNewBook extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("in IssueNewBook");
		BookDAO dao = new BookDAO();
		List<Book_issue_return_pojo> issueDetails = dao.getAllBooks();
		System.out.println(issueDetails);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("bookIssueDetails", issueDetails);
		return mapping.findForward("success");
	}
	

}
