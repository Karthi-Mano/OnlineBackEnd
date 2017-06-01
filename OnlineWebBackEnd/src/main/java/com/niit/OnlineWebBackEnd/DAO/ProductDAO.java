package com.niit.OnlineWebBackEnd.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.niit.OnlineWebBackEnd.model.CategoryModel;
import com.niit.OnlineWebBackEnd.model.ProductModel;


//@Service

public interface ProductDAO
{
 
	
	//create 
	public void addProduct(ProductModel product);

	//read
	public ProductModel getId(int id);
	//update
	public void update(ProductModel product);
	//deleted
	public void delete(ProductModel p);
	//Get All
	public List<ProductModel> getAll();
	
	public ProductModel findById(int id);
	

	
}
