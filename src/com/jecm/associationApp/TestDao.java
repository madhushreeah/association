package com.jecm.associationApp;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {
public static void main(String[] args){
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	

	
	//many employees
	Employee employee1=new Employee();
	employee1.setName("madhu");
	employee1.setAddress("rajaji nagar");
	
	Employee employee2=new Employee();
	employee2.setName("kavya");
	employee2.setAddress("jalahalli");
	
	Employee employee3=new Employee();
	employee3.setName("Nisha");
	employee3.setAddress("white feild");
	
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(employee1);
	list.add(employee2);
	list.add(employee3);
	//one company
	Company capgemini=new Company();
	capgemini.setName("capgemini");
	capgemini.setAddress("PSN big bazar");
	capgemini.setListOfEmployee(list);
	

session.save(capgemini);

transaction.commit();
session.close();
}
}
