package dev.ranieri.services;

import java.util.Set;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;

public class BookServiceImpl implements BookService{
	
	private BookDAO bdao;
	
	public BookServiceImpl(BookDAO bdao) {
		this.bdao = bdao;
	}

	public Book addBook(Book book) {	
		return this.bdao.createBook(book);
	}

	public Book getBookById(int id) {
		return this.bdao.getBookById(id);
	}

	public Set<Book> getBooksByAuthor(String name) {
		return null;
	}

	public Set<Book> getBooksByGenre(String genre) {
		return null;
	}

	public Set<Book> getBooksByLength(String order) {
		return null;
	}

	public Book updateBook(Book book) {
		return this.bdao.updateBook(book);
	}

	public boolean deleteBook(Book book) {
		boolean result = this.bdao.deleteBook(book);
		return result;
	}

	public boolean deleteBook(int id) {
		Book book = new Book();
		book.setId(id);
		boolean result = this.deleteBook(book);
		return result;
	}

	@Override
	public Set<Book> getAllBooks() {		
		return this.bdao.getAllBooks();
	}

}
