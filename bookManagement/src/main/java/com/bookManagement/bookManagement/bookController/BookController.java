package com.bookManagement.bookManagement.bookController;

import java.util.List;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookManagement.bookManagement.entities.book;
import com.bookManagement.bookManagement.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/home")
	public String home()
	{
		return "welcome to book management tool";
	}
	
	//get all books
	@GetMapping("/books")
	public List<book> books()
	{
		return this.bookService.getBooks();
	}
	
	//add a new book
	@PostMapping(path = "/book", consumes = "application/json")
	public String book(@RequestBody book newBook)
	{
		return this.bookService.addBook(newBook);
	}
	
	//get one book by its name
	@GetMapping("/books/{name}")
	public book book(@PathVariable String name)
	{
		return this.bookService.getBook(name);
	}
	
	//get all books written by a particular author
	@GetMapping("/booksbyauthor/{authorName}")
	public List<book> booksByAuthorName(@PathVariable String authorName)
	{
		return this.bookService.getBookByAuthorName(authorName);
	}
	
	//update a book name
	@PutMapping("/upadtebookname")
	public String updateBookName(@RequestBody book book)
	{
		return this.bookService.updateBookName(book);
	}
	//update author name
	//delete a book
	
}
