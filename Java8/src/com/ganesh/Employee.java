package com.ganesh;

public class Employee {
	String name;
	String designation;
	double salary;
	String city;
	Employee(String name, String designation, double salary, String city)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.city=city;
	}
	
	public String toString()
	{
		String s=String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
		return s;
	}
	

}
