package com.niit.OnlineWebBackEnd.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

//Entity Mapped to the table
@Entity	
@Table(name="ProductModel")
public class ProductModel implements Serializable
{
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//id is an primary key
  @Id
  @Column(name="productid")
	private int productid;
  //private String productbrand;
  @Column(name="productname")
  private String productname;
  //private String productdiscription;
  @Column(name="productprice")
  private int productprice;
  //private int productquantity;
  @ManyToOne
  @JoinColumn(name="categoryid")
  private CategoryModel  categoryid;
  @ManyToOne
  @JoinColumn(name="suplierid")
  private SupplierModel suplierid;
  private String p_image;
  //private byte[] productImage;
  //private MultipartFile images;
  
  /*@Transient
	MultipartFile defaultimage;
	
	@Transient
	List<MultipartFile> detailimage; 
*/
 
  
 







public ProductModel() {
		super();
		
	}

//@Id

//@Column(name="productid")//defining the database column

public int getProductid() {
	return productid;
}


public void setProductid(int productid) {
	this.productid = productid;
}


//@Column(name="productname")
public String getProductname() {
	return productname;
}


public void setProductname(String productname) {
	this.productname = productname;
}


//@Column(name="productprice")
public int getProductprice() {
	return productprice;
}


public void setProductprice(int productprice) {
	this.productprice = productprice;
}





//In One category we have MultipleProducts
//@ManyToOne
//@JoinColumn(name="categoryid")
public CategoryModel getCategoryid() {
	return categoryid;
}

public void setCategoryid(CategoryModel categoryid) {
	this.categoryid = categoryid;
}

//In One supplier can have MultipleProducts
//@ManyToOne
//@JoinColumn(name="suplierid")
public SupplierModel getSuplierid() {
	return suplierid;
}


public void setSuplierid(SupplierModel suplierid) {
	this.suplierid = suplierid;
}



public String getP_image() {
	return p_image;
}

public void setP_image(String p_image) {
	this.p_image = p_image;
}

public ProductModel(int productid, String productname, int productprice, CategoryModel categoryid,
		SupplierModel suplierid) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.productprice = productprice;
	this.categoryid = categoryid;
	this.suplierid = suplierid;
}






}
