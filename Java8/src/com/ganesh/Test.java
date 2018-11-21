/*package com.ganesh;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
public static void main(String[] args) {
ArrayList<Employee>list=new ArrayList<Employee>();
populate(list);
Predicate<Employee>p1=emp->emp.designation.equals("Manager");
display(p1, list);

Predicate<Employee>p2=emp->emp.salary<20000;
System.out.println("All Employees information whose salary <2000");
display(p2, list);


}

public static void populate(ArrayList<Employee>list)
{
	list.add(new Employee("Durga", "CEO", 30000, "HYD"));
	list.add(new Employee("Bunny", "Manager", 10000, "BAN"));
	list.add(new Employee("Ganesh", "Deve", 10000, "PUNE"));
}

public static void display(Predicate<Employee> p,ArrayList<Employee>list)
{
	for(Employee e:list)
	{
		if(p.test(e))
		{
			System.out.println(e);
		}
	}
}
}
*/