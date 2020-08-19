package com.montran.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;



@Entity(name="Member_master")
public class Member_Pojo {
	
	@Id
	@Column(name="member_code",nullable = false)
	private String member_code;
	private String name;
	
	@Column(name="member_type")
	private String member_type;
	
	@JoinColumn(name="book_code")
	private String book_code;
	
	@Column(name="no_of_books_issued")
	private int noofbooksissued;

	public Member_Pojo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member_Pojo(String member_code, String name, String member_type, String book_code, int noofbooksissued) {
		super();
		this.member_code = member_code;
		this.name = name;
		this.member_type = member_type;
		this.book_code = book_code;
		this.noofbooksissued = noofbooksissued;
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


	public String getMember_type() {
		return member_type;
	}


	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}


	public String getBook_code() {
		return book_code;
	}


	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}


	public int getNoofbooksissued() {
		return noofbooksissued;
	}


	public void setNoofbooksissued(int noofbooksissued) {
		this.noofbooksissued = noofbooksissued;
	}


	@Override
	public String toString() {
		return "Member_Pojo [member_code=" + member_code + ", name=" + name + ", member_type=" + member_type
				+ ", book_code=" + book_code + ", noofbooksissued=" + noofbooksissued + "]";
	}

	
		
}
