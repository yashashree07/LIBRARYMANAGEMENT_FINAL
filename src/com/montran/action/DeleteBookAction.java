package com.montran.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class DeleteBookAction extends Action{

		
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("in deletebook action");
		
		Book_issue_return_pojo bookIssueReturn=null;
		
		
		BookDAO dao=new BookDAO();
		GetDetailsForm detailsForm=(GetDetailsForm) form;
	
		List <Integer>issueno=new ArrayList<Integer>();
		issueno=dao.getIssueNo();
		System.out.println("issueno----"+issueno);
		
		int issueSerialNo=detailsForm.getIssue_serial_no();
		
		dao.deleteData(issueSerialNo);

		/*for (Integer integer : issueno) {
			if(integer.equals(issueSerialNo))
			{
				dao.deleteData(issueSerialNo);
			}
		}*/
		
		
		return mapping.findForward("success");
	}
}
