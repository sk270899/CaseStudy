package com.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Creates Table in DB with name same as class name
public class Admin {
	@Id //sets a column as primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // automatically generates value for Id
	private int Aid;
	private String Aname;	
	private String Aaddress;
	private String Aemail;
	private long Ano;
	private String Apassword;
	
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		this.Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		this.Aname = aname;
	}
	public String getAaddress() {
		return Aaddress;
	}
	public void setAaddress(String aaddress) {
		this.Aaddress = aaddress;
	}
	public String getAemail() {
		return Aemail;
	}
	public void setAemail(String aemail) {
		this.Aemail = aemail;
	}
	public long getAno() {
		return Ano;
	}
	public void setAno(long ano) {
		this.Ano = ano;
	}
	
	public String getApassword() {
		return Apassword;
	}
	public void setApassword(String apassword) {
		Apassword = apassword;
	}
	
	/*
	 * @Override public String toString() { return "Admin [Aid=" + Aid + ", Aname="
	 * + Aname + ", Aaddress=" + Aaddress + ", Aemail=" + Aemail + ", Ano=" + Ano +
	 * ", Apassword=" + Apassword + "]"; } public Admin(int aid, String aname,
	 * String aaddress, String aemail, long ano, String apassword) { super(); Aid =
	 * aid; Aname = aname; Aaddress = aaddress; Aemail = aemail; Ano = ano;
	 * Apassword = apassword; }
	 */
	public Admin() {}
	
	
}
