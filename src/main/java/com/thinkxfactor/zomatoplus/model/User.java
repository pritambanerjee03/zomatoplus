package com.thinkxfactor.zomatoplus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")

public class User implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long id;
	@Column(name="username",unique=true)
	private String username;
	@Column(name="password")
	private String password;
	
	@Column(name="type")
	private String type;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	
	

	

		public User() {
		super();
	}

		public User(long id, String username, String password, String type, String mobile, String address, String landmark,
			String pincode) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.mobile = mobile;
		this.address = address;
		this.landmark = landmark;
		this.pincode = pincode;
	}

		public long getId() {
			return id;
		}

		public String getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}

		public String getType() {
			return type;
		}

		public String getMobile() {
			return mobile;
		}

		public String getAddress() {
			return address;
		}

		public String getLandmark() {
			return landmark;
		}

		public String getPincode() {
			return pincode;
		}

		public void setId(long id) {
			this.id = id;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
	
	

	

}
