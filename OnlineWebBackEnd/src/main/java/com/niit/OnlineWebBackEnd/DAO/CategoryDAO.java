package com.niit.OnlineWebBackEnd.DAO;

import java.util.List;
import java.util.Set;

import com.niit.OnlineWebBackEnd.model.CategoryModel;


public interface CategoryDAO 
{

	//create 
	    
	 	public void addCategory(CategoryModel category1);
		//read
		public CategoryModel getId(int id);
		//update
		public void update(CategoryModel category);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<CategoryModel> getAll();
		
		public CategoryModel findById(int id);
}
