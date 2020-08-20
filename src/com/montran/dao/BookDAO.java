package com.montran.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.montran.form.AddNewBookForm;
import com.montran.pojo.Book_issue_return_pojo;
import com.montran.pojo.Book_pojo;
import com.montran.pojo.Member_Pojo;
import com.montran.util.SessionFactoryUtil;

public class BookDAO {
	
	private Session session;
	private Transaction transaction;
	private SessionFactory factory=SessionFactoryUtil.getFactory();
	private int issue_serial_no;
	
	public List<Book_issue_return_pojo> getAllBooks()
	{
		session=factory.openSession();
		Query query=session.createQuery("from Book_issue_return");
		List<Book_issue_return_pojo> bookList = query.list();
		System.out.println(bookList);
		session.close();
		return bookList;
	}//end of getallbooks

	public Member_Pojo getMemberByMemberCode(String memberCode) {
		session = SessionFactoryUtil.getFactory().openSession();
		Member_Pojo member = session.get(Member_Pojo.class, memberCode);
		System.out.println(member);
		session.close();
		return member;
	}//end of getmemberbymembercode

	public Book_pojo getBookByBookCode(String bookCode) {
		session = SessionFactoryUtil.getFactory().openSession();
		Book_pojo book = session.get(Book_pojo.class, bookCode);
		System.out.println(book);
		session.close();
		return book;
	}//end of getBookByBookCode

	public void issueNewBook(Book_issue_return_pojo details) {
		session = SessionFactoryUtil.getFactory().openSession();
		transaction = session.beginTransaction();
		session.save(details);
		transaction.commit();
		session.close();
	}//end of issueNewbook
	
	
	public void deleteData(int issueNo) {
		
		session=SessionFactoryUtil.getFactory().openSession();
		transaction=session.beginTransaction();
		int flag=0;
		Book_issue_return_pojo book_issue_return;
		if(flag==0)
		{
			book_issue_return=session.get(Book_issue_return_pojo.class,issueNo);
			flag=1;
			if(flag==1)
			{
				session.delete(book_issue_return);
				System.out.println("member deleted succesfully check db");
			}
		}
		transaction.commit();
		session.close();
		System.out.println("member deleted from delete func");
		
	}//end of deleteData
	
	public List<Integer> getIssueNo() {
		session = SessionFactoryUtil.getFactory().openSession();
		Query query = session.createQuery("select distinct(issue_serial_no) from Book_issue_return");
		List<Integer> issueList = query.list();
		
		List<Integer> issueNoList=new ArrayList<Integer>();
		session.close();
		
		return issueList;
	}
	
}
