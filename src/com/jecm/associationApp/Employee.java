package com.jecm.associationApp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="EID")//it gives column name in table
	private int eid;
	@Column(name="E_NAME")
	private String name;
	@Column(name="E_ADDRESS")
	private String address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
