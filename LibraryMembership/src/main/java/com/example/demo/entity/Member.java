package com.example.demo.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Member {
	private int id;
	private String name;
	private String address;
	private String phone;
	private List<BookInstance> bookList;
	public Member(int id, String name, String address,
	 String phone,List<BookInstance> bookList) {
		super();
		this.id = id;
		this.name = name;
		this.bookList = bookList;
		this.address=address;
		this.phone= phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BookInstance> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookInstance> bookList) {
		this.bookList = bookList;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
