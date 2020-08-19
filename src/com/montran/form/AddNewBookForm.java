package com.montran.form;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts.action.ActionForm;

import com.montran.pojo.Book_issue_return_pojo;
import com.montran.pojo.Book_pojo;
import com.montran.pojo.Member_Pojo;

public class AddNewBookForm extends ActionForm {
	
	private int issue_serial_no;
	private String member_code;
	private String name;
	private String book_code;
	private String title;
	private String author;
	private Date issue_date=new Date();
	private String return_date;
	
	private Book_pojo book;
	private Member_Pojo member;
	
	public Book_pojo getBook() {
		return book;
	}
	public void setBook(Book_pojo book) {
		this.book = book;
	}
	public Member_Pojo getMember() {
		return member;
	}
	public void setMember(Member_Pojo member) {
		this.member = member;
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
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	
	
}
