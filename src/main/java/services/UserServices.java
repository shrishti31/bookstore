package services;

import java.util.List;

import daoImpl.UserDaoImpl;
import model.User;

public class UserServices {
	
	public UserDaoImpl userdaoimpl;
	
	public UserDaoImpl getUserdaoimpl() {
		return userdaoimpl;
	}

	public void setUserdaoimpl(UserDaoImpl userdaoimpl) {
		this.userdaoimpl = userdaoimpl;
	}

	public void addUser(User user)
	{
		this.userdaoimpl.addUser(user);
	}
	
	public void updateUser(User user)
	{
		this.userdaoimpl.updateUser(user);
	}

	public List<User> viewUsers()
	{
		return this.userdaoimpl.viewUser();
	}
	
	public User viewUserById(int id)
	{
		return this.userdaoimpl.viewUserById(id);
	}
	
	/*public void deleteUser(User user)
	{
		this.userdaoimpl.deleteUser(user);
	}
	*/
	public boolean verifyUser(String email,String password)
	{
		return this.userdaoimpl.verifyUser(email, password);
	}
}
