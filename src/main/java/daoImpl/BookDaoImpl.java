package daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.BookDao;
import model.Book;


public class BookDaoImpl implements BookDao{

	private HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	
	public void addBook(Book b) {
		this.hTemplate.save(b);
		
	}

	public List<Book> viewBook() {
		return this.hTemplate.find("from Book");
	}
	
	public Book viewBookById(int id) {
		return this.hTemplate.get(Book.class,id);
	}

	public void updateBook(Book b) {
		this.hTemplate.update(b);
		
	}

	public void deleteBook(Book b) {
		this.hTemplate.delete(b);
		
	}

}
