package com.niit.OnlineWebBackEnd.Impl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.OnlineWebBackEnd.DAO.UserDAO;
import com.niit.OnlineWebBackEnd.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO
{

	

	 @Autowired
		private SessionFactory sessionFactory;
	//public UserDAOImpl(){}
	
	/*public SessionFactory getSessionFactory(){
		return sessionFactory;
	}*/	
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
		public void addUser(UserModel u)
		{
			// TODO Auto-generated method stub
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(u);
			s.getTransaction().commit();
			s.close();
			
		}
	

	public void getId(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(UserModel User) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<UserModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
