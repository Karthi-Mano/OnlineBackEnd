package com.niit.OnlineWebBackEnd.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Entity Mapped to the table
@Entity	
@Table(name="SupplierModel")
public class SupplierModel implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	private int suplierid;
	private String suppliername;
	//private String setofproducts;
	//private int orders;
	private Set<ProductModel> setofproducts;
	
	
	
	
	
	
	public SupplierModel() {
		super();
	}
	public SupplierModel(int suplierid, String suppliername) {
		super();
		this.suplierid = suplierid;
		this.suppliername = suppliername;
		//this.orders = orders;
	}
	@Id
	//@GeneratedValue
	@Column(name="suplierid")//defining the database column
	public int getSuplierid() {
		return suplierid;
	}
	public void setSuplierid(int suplierid) {
		this.suplierid = suplierid;
	}
	@Column(name="suppliername")
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	
	
	//One supplier have multiple setproducts
	 @OneToMany(targetEntity=ProductModel.class, mappedBy="suplierid", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@Column(name="setofproducts")
	public Set<ProductModel> getSetofproducts() {
		return setofproducts;
	}
	public void setSetofproducts(Set<ProductModel> setofproducts) {
		this.setofproducts = setofproducts;
	}
	

}
