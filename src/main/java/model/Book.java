package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Book {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	int book_id;
	
	int book_category_id;
	
	String book_category_name;
	
	String book_name;
	
	int Book_price;
	
	String book_description;

	@ManyToMany(mappedBy="book")
	@LazyCollection(LazyCollectionOption.FALSE)
	List<User> user=new ArrayList<User>();
	@JoinColumn(name="quantity")
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getBook_category_id() {
		return book_category_id;
	}

	public void setBook_category_id(int book_category_id) {
		this.book_category_id = book_category_id;
	}

	public String getBook_category_name() {
		return book_category_name;
	}

	public void setBook_category_name(String book_category_name) {
		this.book_category_name = book_category_name;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_price() {
		return Book_price;
	}

	public void setBook_price(int book_price) {
		Book_price = book_price;
	}

	public String getBook_description() {
		return book_description;
	}

	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_category_id=" + book_category_id + ", book_category_name="
				+ book_category_name + ", book_name=" + book_name + ", Book_price=" + Book_price + ", book_description="
				+ book_description + "]";
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
}



