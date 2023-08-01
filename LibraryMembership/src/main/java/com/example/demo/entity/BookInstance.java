package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookInstance {
	private String bookName;
	private boolean isBorrowed;
	private Date startDate;

	public BookInstance(String bookName, boolean isBorrowed, Date startDate) {
		super();
		this.bookName = bookName;
		this.isBorrowed = isBorrowed;
		this.startDate = startDate;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
