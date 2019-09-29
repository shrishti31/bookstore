	package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Book;

import model.User;
import services.BookServices;


@Controller

public class AdminController {


	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	BookServices bookservices=(BookServices)context.getBean("bookservices");
	Book book=(Book)context.getBean("book");

	@RequestMapping(value="/addbook")
	public void addBook(HttpServletRequest req,HttpServletResponse res) {
		
		int b_cat_id=Integer.parseInt(req.getParameter("book_category_id"));
		String b_cat_name=req.getParameter("book_category_name");
		String b_name=req.getParameter("book_name");
		int b_price=Integer.parseInt(req.getParameter("book_price"));
		String b_descr=req.getParameter("book_description");
		
		book.setBook_category_id(b_cat_id);
		book.setBook_category_name(b_cat_name);
		book.setBook_name(b_name);
		book.setBook_price(b_price);
		book.setBook_description(b_descr);
		
		bookservices.addBook(book);
		
		/*ModelAndView mv = new ModelAndView();
		mv.setViewName("adminpage.jsp");
		mv.addObject("bookk", book);
		return mv;*/
		
	}
	
	@RequestMapping(value="/viewbook")
	public ModelAndView viewBookById(HttpServletRequest req,HttpServletResponse res) {
		
		int book_id=Integer.parseInt(req.getParameter("bookid"));
		
		Book b = bookservices.viewBookById(book_id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminpage.jsp");
		mv.addObject("b_id", b.getBook_id());
		mv.addObject("b_cid", b.getBook_category_id());
		mv.addObject("b_cname", b.getBook_category_name());
		mv.addObject("b_name", b.getBook_name());
		mv.addObject("b_price", b.getBook_price());
		mv.addObject("b_desc", b.getBook_description());
		return mv;
		
	}
	
	@RequestMapping(value="/updatebook")
	public void updateBook(HttpServletRequest req,HttpServletResponse res) {
		
		book.setBook_category_id(Integer.parseInt(req.getParameter("book_category_id")));
		book.setBook_category_name(req.getParameter("book_category_name"));
	book.setBook_id(Integer.parseInt(req.getParameter("book_id")));
		book.setBook_name(req.getParameter("book_name"));
		book.setBook_price(Integer.parseInt(req.getParameter("book_price")));
		book.setBook_description(req.getParameter("book_description"));
		
		 bookservices.updateBook(book);
		
	}
	

	@RequestMapping(value="/deletebook")
	public void deleteBook(HttpServletRequest req,HttpServletResponse res) {
		
		book.setBook_id( Integer.parseInt(req.getParameter("book_id")));
		 bookservices.deleteBook(book);
		
	}
	
	@RequestMapping(value="/viewallbooks")
	public ModelAndView viewBooks(HttpServletRequest req,HttpServletResponse res) {
		 bookservices.viewBooks();
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("view.jsp");
		 mv.addObject("bookkk",book);
		 
		 return mv;
		
	}
	
}
