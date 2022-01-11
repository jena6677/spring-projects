package com.bookManagement.bookManagement.entities;

public class book {

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long bookId;
	private String category;
	private String name;
	private String author;
	private String publisher;
	@Override
	public String toString() {
		return "book [category=" + category + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ "]";
	}
	public book(String category, String name, String author, String publisher, Long bookId) {
		super();
		this.category = category;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.bookId = bookId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
}
