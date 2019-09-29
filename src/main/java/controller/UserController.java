package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import services.UserServices;

@Controller
public class UserController {

	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	UserServices userservices=(UserServices)context.getBean("userservices");
	
	@RequestMapping(value="/signup")
	public void addUser(HttpServletRequest req,HttpServletResponse resp)
	{
		String email = req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String pincode=req.getParameter("pincode");
		String contactno=req.getParameter("contactno");
		
		
		User user=(User)context.getBean("user");
		
		user.setEmail(email);
		user.setPassword(password);
		user.setAddress(address);
		user.setPincode(pincode);
		user.setContactno(contactno);
		
		userservices.addUser(user);
	}
	
	@RequestMapping(value="/login")
	public ModelAndView verifyUser(HttpServletRequest req,HttpServletResponse res,HttpSession session) {
		User user=(User)context.getBean("user");
		
		String email = req.getParameter("email");
		String password=req.getParameter("password");
		
	     boolean IsValidUser=userservices.verifyUser(email, password);
	     session.setAttribute("username",email);
	    
		ModelAndView mv = new ModelAndView();
		if(IsValidUser==true)
		{
			mv.setViewName("home.jsp");
			mv.addObject("userr", user);
		}
		else
		{
			System.out.println("invalid user");
			mv.setViewName("userpage.jsp");
		}
		return mv;
		
	}
	
	@RequestMapping(value="/viewallusers")
	
	public ModelAndView viewAllUsers()
	{
		List<User> lst = userservices.viewUsers();
		
		ModelAndView mv=new ModelAndView();
		 mv.setViewName("home.jsp");
		 mv.addObject("userrr",lst);
		 
		return mv;
	}
	
	@RequestMapping(value="/addtocart")
	
	public void addtocart(HttpServletRequest req,HttpServletResponse res) {
		userservices.addtocart(Integer.parseInt(req.getParameter("uid")),Integer.parseInt(req.getParameter("bid")));
		
		
	}
}
