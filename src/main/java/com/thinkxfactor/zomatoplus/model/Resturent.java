package com.thinkxfactor.zomatoplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_rst")

public class Resturent {
	
	
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="contact")
	private String contact;
	@Column(name="description")
	private String description;
	@Column(name="website")
	private String website;
	@Column(name="like_count")
	private int like_count;
	
	public Resturent() {
		super();
	}

	public Resturent(long id, String name, String address, String city, String contact, String description,
			String website, int like_count) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.contact = contact;
		this.description = description;
		this.website = website;
		this.like_count = like_count;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getContact() {
		return contact;
	}

	public String getDescription() {
		return description;
	}

	public String getWebsite() {
		return website;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	
	

}
