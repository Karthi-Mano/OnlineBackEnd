package com.niit.OnlineWebBackEnd.DAO;

import java.util.List;

import com.niit.OnlineWebBackEnd.Impl.CartDAOImpl;
import com.niit.OnlineWebBackEnd.model.CartModel;

public interface CartDAO  
{

	

	 //save
	public void save(CartModel cart);
    //read
		public CartModel getId(int id);
		//update
		public void update(CartModel cart);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<CartModel> getAll();


}
