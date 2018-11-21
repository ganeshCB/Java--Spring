package empsal;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
public static void main(String[] args) {
	ArrayList<Employee>l=new ArrayList<Employee>();
	populate(l);
	System.out.println("Before Incremtnt");
	System.out.println(l);
	
	
	Predicate<Employee>p=e1->e1.salary<450000;
	Function<Employee, Employee>f1=e1->{
		e1.salary=e1.salary+477;
		return e1;
	};
	System.out.println("After Increment");
	ArrayList<Employee>l2=new ArrayList<Employee>();
	
	for(Employee e1:l)
	{
		if(p.test(e1))
		{
			f1.apply(e1);
			l2.add(e1);
		}
	}
	System.out.println(l);
	System.out.println("Employee whose salry incremted");
	System.out.println(l2);
	
	Function<ArrayList<Employee>, Double>f=l1->{
		double total=0;
		for(Employee e:l1)
		{
			total=total+e.salary;
		}
		return total;
	};
	System.out.println("The total salary of this month:"+f.apply(l));
}

public static void populate(ArrayList<Employee>l) {
	l.add(new Employee("Durga", 50000.0));
	l.add(new Employee("Kala", 250000.0));
	l.add(new Employee("sala", 503000.0));
	l.add(new Employee("tillu", 503000.0));
	l.add(new Employee("mullu",450000.0));
	
}
}
