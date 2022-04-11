package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private int Oid;
	private String Oname;
	private int Oprice;
	private String Ocategory;
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getOname() {
		return Oname;
	}
	public void setOname(String oname) {
		Oname = oname;
	}
	public int getOprice() {
		return Oprice;
	}
	public void setOprice(int oprice) {
		Oprice = oprice;
	}
	public String getOcategory() {
		return Ocategory;
	}
	public void setOcategory(String ocategory) {
		Ocategory = ocategory;
	}
	public Cart(int oid, String oname, int oprice, String ocategory) {
		super();
		Oid = oid;
		Oname = oname;
		Oprice = oprice;
		Ocategory = ocategory;
	}
	@Override
	public String toString() {
		return "Cart [Oid=" + Oid + ", Oname=" + Oname + ", Oprice=" + Oprice + ", Ocategory=" + Ocategory + "]";
	}
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
}
