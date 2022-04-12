package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pid;
	private String Pname;
	private int Pprice;
	private String Pcategory;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		this.Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		this.Pname = pname;
	}
	public int getPprice() {
		return Pprice;
	}
	public void setPprice(int pprice) {
		this.Pprice = pprice;
	}
	public String getPcategory() {
		return Pcategory;
	}
	public void setPcategory(String pcategory) {
		this.Pcategory = pcategory;
	}

	/*
	 * @Override public String toString() { return "Product [Pid=" + Pid +
	 * ", Pname=" + Pname + ", Pprice=" + Pprice + ", Pcategory=" + Pcategory + "]";
	 * } public Product(int pid, String pname, int pprice, String pcategory) {
	 * super(); this.Pid = pid; this.Pname = pname; this.Pprice = pprice;
	 * this.Pcategory = pcategory; }
	 */
	public Product() {}
	
	
	
}
