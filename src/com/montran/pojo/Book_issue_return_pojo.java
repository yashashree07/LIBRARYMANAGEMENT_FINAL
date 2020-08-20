package com.montran.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="Book_issue_return")
public class Book_issue_return_pojo {
	
	@Id
	@Column(name="issue_serial_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="issue_serial_no")
	@SequenceGenerator(name="issue_serial_no",sequenceName="issue_serial_no")
	private int issue_serial_no;
	
	@OneToOne()
	@JoinColumn(name="member_code")
	private	Member_Pojo member;
	
	
	@OneToOne()
	@JoinColumn(name="book_code")
	private Book_pojo book;
	
	@Column(name="issue_date")
	private Date issue_date=new Date();
	
	
	
	@Column(name="return_date")
	private Date return_date;
	//private Date return_date;
	
	
	
	public Book_issue_return_pojo() {
		// TODO Auto-generated constructor stub
	}



	public Book_issue_return_pojo(int issue_serial_no, Member_Pojo member, Book_pojo book, Date issue_date,
			Date returnD) {
		super();
		this.issue_serial_no = issue_serial_no;
		this.member = member;
		this.book = book;
		this.issue_date = issue_date;
		this.return_date = returnD;
		
	}



	public int getIssue_serial_no() {
		return issue_serial_no;
	}



	public void setIssue_serial_no(int issue_serial_no) {
		this.issue_serial_no = issue_serial_no;
	}



	public Member_Pojo getMember() {
		return member;
	}



	public void setMember(Member_Pojo member) {
		this.member = member;
	}



	public Book_pojo getBook() {
		return book;
	}



	public void setBook(Book_pojo book) {
		this.book = book;
	}



	public Date getIssue_date() {
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
	}



	@Override
	public String toString() {
		return "Book_issue_return_pojo [issue_serial_no=" + issue_serial_no + ", member=" + member + ", book=" + book
				+ ", issue_date=" + issue_date + ", return_date=" + return_date + "]";
	}
	
	






}
