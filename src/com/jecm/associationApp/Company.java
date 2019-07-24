package com.jecm.associationApp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
public class Company {
@Id
@GeneratedValue
@Column(name="CID")//it gives column name in table
private int cid;
@Column(name="C_NAME")
private String name;
@Column(name="C_ADDRESS")
private String address;

@OneToMany(cascade=CascadeType.ALL)//cascade attribute will transfer all parent object operation to child object(Company is parent n employee is child operation(crud))
private List<Employee> listOfEmployee = new ArrayList<Employee>();

public List<Employee> getListOfEmployee() {
	return listOfEmployee;
}
public void setListOfEmployee(List<Employee> listOfEmployee) {
	this.listOfEmployee = listOfEmployee;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
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
