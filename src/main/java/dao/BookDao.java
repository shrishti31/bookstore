
package dao;

import java.util.List;

import model.Book;

public interface BookDao {

public void addBook(Book b);
	
	public List<Book> viewBook();
	
	public void updateBook(Book b);
	
	public void deleteBook(Book b);
	
	public Book viewBookById(int id) ;
	
}
