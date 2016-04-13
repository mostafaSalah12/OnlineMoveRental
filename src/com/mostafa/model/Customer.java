package com.mostafa.model;

import java.util.Date;

public class Customer {
	
	private int customerId;
	private short storeId;
	private String firstName;
	private String lastName;
	private String email;
	private int addressId;
	private short active;
	private Date createDate;
	private Date lastUpdate;
		
	public Customer(){}

	public Customer(int customerId, short storeId, String firstName, String lastName, String email, int addressId,
			short active, Date createDate, Date lastUpdate) {
		
		this.customerId = customerId;
		this.storeId = storeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.addressId = addressId;
		this.active = active;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
	}
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public short getStoreId() {
		return storeId;
	}
	public void setStoreId(short storeId) {
		this.storeId = storeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public short getActive() {
		return active;
	}
	public void setActive(short active) {
		this.active = active;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
