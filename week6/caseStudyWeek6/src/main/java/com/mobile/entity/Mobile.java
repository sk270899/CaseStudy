package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobiledata")
public class Mobile {
	@Id
	@Column
	private int mobileId;
	@Column(length = 20)
	private String mobileName;
	@Column(length = 20)
	private String mobileType;
	@Column
	private int mobilePrice;
	@Column
	private int mobileWarenty;
	@Column
	private int mobileIMEINumber;

	
	//default constructor
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Mobile(int mobileId, String mobileName, String mobileType, int mobilePrice, int mobileWarenty,
			int mobileIMEINumber) {
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}

	//getters and setters
	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public int getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public int getMobileWarenty() {
		return mobileWarenty;
	}

	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}

	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}

	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}

	//toString method
	@Override
	public String toString() {
		return "MobileEntity [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileType=" + mobileType
				+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}

}
