package com.niit.OnlineWebBackEnd.DAO;

import java.util.List;


import com.niit.OnlineWebBackEnd.model.SupplierModel;

public interface SupplierDAO 
{
	//create 
	 	public void addSupplier(SupplierModel supplier);
		//read
		public SupplierModel getId(int id);
		//update
		public void update(SupplierModel supplier);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<SupplierModel> getSave();
		
		public SupplierModel findById(int id);
}
