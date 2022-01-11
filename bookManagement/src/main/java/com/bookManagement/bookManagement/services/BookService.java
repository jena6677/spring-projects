package com.bookManagement.bookManagement.services;

import java.util.List;

import com.bookManagement.bookManagement.entities.book;

public interface BookService {

	public List<book> getBooks();
	public String addBook(book newBook);
	public book getBook(String boookName);
	public List<book> getBookByAuthorName(String authorName);
	public String updateBookName(book book);
}
