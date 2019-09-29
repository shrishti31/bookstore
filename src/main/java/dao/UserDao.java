package dao;

import java.util.List;

import model.Book;
import model.User;

public interface UserDao {

public void addUser(User u);
	
	public List<User> viewUser();
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
	
	public boolean verifyUser(String email,String password);
	
	public void addtocart(int bookid ,int userid);
	
}
