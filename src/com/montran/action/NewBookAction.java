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
import com.montran.form.BookForm;
import com.montran.form.GetDetailsForm;



public class NewBookAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("in newbookaction");
		
		return mapping.findForward("success");
	}

}
