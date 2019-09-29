package dao;

import java.util.List;

import model.User;

public interface UserDao {

public void addUser(User u);
	
	public List<User> viewUser();
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
	
	public boolean verifyUser(String email,String password);
	
}
