package daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.UserDao;
import model.User;

public class UserDaoImpl implements UserDao{

	private HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	
	public void addUser(User u) {
		this.hTemplate.save(u);
	}

	public List<User> viewUser() {
		return this.hTemplate.find("from User");
	}
	
	public User viewUserById(int id)
	{
		return this.hTemplate.get(User.class,id);
	}

	public void updateUser(User u) {
		this.hTemplate.update(u);
	}

	public void deleteUser(User u) {
		this.hTemplate.delete(u);
	}
	
	public boolean verifyUser(String email,String password) {
		boolean IsValidUser;
		List userObj=(List)hTemplate.find("from User where email=? and password=?",email,password);
		if(userObj != null && userObj.size() > 0) 
		{
			IsValidUser=true;
		}
		else
			IsValidUser=false;
		
		return IsValidUser;
	}

	

}
