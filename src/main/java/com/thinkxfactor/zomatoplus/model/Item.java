package com.thinkxfactor.zomatoplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_items")
public class Item {
	
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private long id;
	
	@Column(name="restaurant_id")
	private long restaurant_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	
	@Column(name="description")
	private String description;


	public Item() {
		super();
	}


	public Item(long id, long restaurant_id, String name, Double price, String description) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public long getId() {
		return id;
	}


	public long getRestaurant_id() {
		return restaurant_id;
	}


	public String getName() {
		return name;
	}


	public Double getPrice() {
		return price;
	}


	public String getDescription() {
		return description;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setRestaurant_id(long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
