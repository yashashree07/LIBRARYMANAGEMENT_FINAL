package com.montran.form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class BookForm extends ActionForm {
	
	private int issue_serial_no;
	private String member_code;
	private String book_code;
	private String issue_date;
	private String return_date;
	
	
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
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	/*public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}*/
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
