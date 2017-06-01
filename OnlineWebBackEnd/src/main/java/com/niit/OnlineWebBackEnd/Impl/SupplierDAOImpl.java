package com.niit.OnlineWebBackEnd.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.OnlineWebBackEnd.DAO.SupplierDAO;
import com.niit.OnlineWebBackEnd.model.CategoryModel;
import com.niit.OnlineWebBackEnd.model.SupplierModel;

@Repository
public class SupplierDAOImpl implements SupplierDAO 
{
	

	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}

		public void addSupplier(SupplierModel supplier)
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(supplier);
			s.getTransaction().commit();
			s.close();
			
		}

		public SupplierModel getId(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void update(SupplierModel supplier) {
			// TODO Auto-generated method stub
			
		}

		public void deleteById(int id) {
			// TODO Auto-generated method stub
			
		}

		public List<SupplierModel> getSave()
		{
			//@SuppressWarnings("unchecked")
			
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			Query query =s.createQuery("from SupplierModel");        
			List<SupplierModel> list=query.list();
			System.out.println(list);
			s.getTransaction().commit();
			return list;
		}

	
		public SupplierModel findById(int id) {
			SupplierModel s=(SupplierModel)sessionFactory.openSession().get(SupplierModel.class, id);
			return s;
		}
}
