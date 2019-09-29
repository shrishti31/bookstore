package services;

import java.util.List;

import daoImpl.BookDaoImpl;
import daoImpl.UserDaoImpl;
import model.Book;


public class BookServices {
	
	
	public BookDaoImpl bookdaoimpl;
	
	public BookDaoImpl getBookdaoimpl() {
		return bookdaoimpl;
	}

	public void setBookdaoimpl(BookDaoImpl bookdaoimpl) {
		this.bookdaoimpl = bookdaoimpl;
	}

	
	
	
	public void addBook(Book book)
	{
		this.bookdaoimpl.addBook(book);
	}
	
	 public List<Book> viewBooks()
	 {
		 return this.bookdaoimpl.viewBook();
	 }
	 
	 public Book viewBookById(int id)
	 {
		 return this.bookdaoimpl.viewBookById(id);
	 }
	 
	 public void deleteBook(Book book)
	 {
		  this.bookdaoimpl.deleteBook(book);
	 }
	 
	 public void updateBook(Book book)
	 {
		 this.bookdaoimpl.updateBook(book);
	 }
	 
	 public void  viewUsers()
	 {
		// this.userdaoimpl.viewUser();
	 }
	 
	 
	 
	
	 
	

}
