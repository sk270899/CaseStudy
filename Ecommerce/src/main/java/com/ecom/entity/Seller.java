package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
	@Id
	private int Sid;
	private String Sname;
	private String Saddress;
	private String Semail;
	private int Sno;
	private String Spassword;
	public String getSpassword() {
		return Spassword;
	}
	public void setSpassword(String spassword) {
		Spassword = spassword;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		this.Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		this.Sname = sname;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		this.Saddress = saddress;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		this.Semail = semail;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		this.Sno = sno;
	}
	
	
	public Seller(int sid, String sname, String saddress, String semail, int sno, String spassword) {
		super();
		Sid = sid;
		Sname = sname;
		Saddress = saddress;
		Semail = semail;
		Sno = sno;
		Spassword = spassword;
	}
	@Override
	public String toString() {
		return "Seller [Sid=" + Sid + ", Sname=" + Sname + ", Saddress=" + Saddress + ", Semail=" + Semail + ", Sno="
				+ Sno + ", Spassword=" + Spassword + "]";
	}
	public Seller() {
		// TODO Auto-generated constructor stub
	}

}
