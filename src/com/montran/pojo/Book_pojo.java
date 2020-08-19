package com.montran.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Book_master")
public class Book_pojo {
	
	@Id
	@Column(name="book_code",nullable = false)
	private String book_code;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="status")
	private String Status;
	
	public Book_pojo() {
		// TODO Auto-generated constructor stub
	}

	public Book_pojo(String book_code, String title, String author, String status) {
		super();
		this.book_code = book_code;
		this.title = title;
		this.author = author;
		Status = status;
	}

	public String getBook_code() {
		return book_code;
	}

	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}

	public String getTitle() {
		return title;
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

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Book_pojo [book_code=" + book_code + ", title=" + title + ", author=" + author + ", Status=" + Status
				+ "]";
	}
	
	
	
}

