package springbook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbook.book.model.Book;
import springbook.book.model.BookStatus;
import springbook.book.service.BookService;

//focus on controller is only on how to get input, does output reach the client
//as response.. that's it..

@RestController
public class BookController {
	
	
	@Autowired
private BookService bookService;
	
	
	@PutMapping("/updatebook")
	public boolean updateBook(@RequestBody Book updatedBook) {
		// TODO Auto-generated method stub
		System.out.println("input is" + updatedBook);
		return bookService.updateBook(updatedBook);
	}

	@GetMapping("/gbd/{bookId}")
	public BookStatus getBookDetails(@PathVariable int bookId) {
		// TODO Auto-generated method stub
		
		return bookService.getBookDetails(bookId);
	}

	@GetMapping("/gbd")
	public List<Book> getBooksLessthanPrice(@RequestParam int price) {
		// TODO these things we shoud  not show  laziness

		return bookService.getBooksLessthanPrice(price);
	}

}
