package com.bookManagement.bookManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookManagement.bookManagement.entities.book;

@Service
public class BoookServiceImpl implements BookService {

	List<book> list;
	public BoookServiceImpl() {
		list = new ArrayList<>();
		list.add(new book("Romantic","A Night With Sun","Asutosh","Asutosh Publisher",344l));
		list.add(new book("Romantic","A day with Moon","Asutosh","Asutosh Publisher",443l));
		
	}
	
	@Override
	public List<book> getBooks() {
		
		return list;
	}

	@Override
	public String addBook(book newBook) {
		list.add(newBook);
		return "Book added successfully";
	}

	@Override
	public book getBook(String boookName) {
		book bk = null;
		for(book b : list)
		{
			if(b.getName().equals(boookName))
			{
				bk = b;
				break;
			}
		}
		return bk;
	}

	@Override
	public List<book> getBookByAuthorName(String authorName) {
		List<book> list2 = new ArrayList<>();
		for(book b : list)
		{
			if(b.getAuthor().equals(authorName))
			{
				list2.add(b);
			}
		}
		return list2;
	}

	@Override
	public List<book> updateBookName(book book, Long bookId) {
		List<book> list2 = new ArrayList<>();
		
		for(book bk : list)
		{
			int l = bk.getBookId().intValue();
			int l2 = bookId.intValue();
			
			if(l == l2)
			{
				bk.setName(book.getName());
				list2.add(bk);
			}
			else
			{
				list2.add(bk);
			}
		}
		
		list = list2;
		
		return list;
	}

	@Override
	public List<book> deleteBook(int bookId) {
		List<book> list2 = new ArrayList<>();
		
		for(book bk : list)
		{
			int l = bk.getBookId().intValue();
			
			if(l == bookId)
			{
				continue;
			}
			else
			{
				list2.add(bk);
			}
		}
		
		list = list2;
		
		return list;
	}


}
