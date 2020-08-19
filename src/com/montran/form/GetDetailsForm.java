package com.montran.form;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.montran.pojo.Book_pojo;
import com.montran.pojo.Member_Pojo;

public class GetDetailsForm extends ActionForm{
	
	private int issue_serial_no;
	private String member_code;
	private String name;
	private String book_code;
	private String title;
	private String author;
	private String issue_date;
	private String return_date;
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getMember_code()== null || ("".equals(getMember_code()))) {
			errors.add("common.name.err", new ActionMessage("error.common.membercode.required"));
		}
		if(getBook_code()==null || ("".equals(getBook_code())))
		{
			errors.add("common.name.err", new ActionMessage("error.common.bookcode.required"));
		}
		return errors;
	}
	public int getIssue_serial_no() {
		return issue_serial_no;
	}
	public void setIssue_serial_no(int issue_serial_no) {
		this.issue_serial_no = issue_serial_no;
	}
	
	public String getMember_code() {
		return member_code;
	}
	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	
	
	

}
