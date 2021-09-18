package com.cts.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="composition")
	private String[] composition;
	
	
	
	public Medicine(String name, double price, String[] composition) {
		super();
		this.name = name;
		this.price = price;
		this.composition = composition;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String[] getComposition() {
		return composition;
	}
	public void setComposition(String[] composition) {
		this.composition = composition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
