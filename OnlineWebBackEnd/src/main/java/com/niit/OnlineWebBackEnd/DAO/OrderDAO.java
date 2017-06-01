package com.niit.OnlineWebBackEnd.DAO;

import java.util.List;


import com.niit.OnlineWebBackEnd.model.OrderModel;

public interface OrderDAO  
{
	 //save
    public void save(OrderModel cart);
    //read
		public  OrderModel getId(int id);
		//update
		public void update(OrderModel cart);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<OrderModel> getAll();
}
