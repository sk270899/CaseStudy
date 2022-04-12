package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid;
	private String Cname;
	private String Caddress;
	private String Cemail;
	private long Cno;
	private String Cpassword;
	public String getCpassword() {
		return Cpassword;
	}
	public void setCpassword(String cpassword) {
		Cpassword = cpassword;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		this.Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		this.Cname = cname;
	}
	public String getCaddress() {
		return Caddress;
	}
	public void setCaddress(String caddress) {
		this.Caddress = caddress;
	}
	public String getCemail() {
		return Cemail;
	}
	public void setCemail(String cemail) {
		this.Cemail = cemail;
	}
	public long getCno() {
		return Cno;
	}
	public void setCno(long Cno) {
		this.Cno = Cno;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Caddress=" + Caddress + ", Cemail=" + Cemail + ", Cno="
				+ Cno + ", Cpassword=" + Cpassword + "]";
	}
	public Customer(int cid, String cname, String caddress, String cemail, long cno, String cpassword) {
		super();
		Cid = cid;
		Cname = cname;
		Caddress = caddress;
		Cemail = cemail;
		Cno = cno;
		Cpassword = cpassword;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
}
