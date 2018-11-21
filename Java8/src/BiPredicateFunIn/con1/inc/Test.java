package BiPredicateFunIn.con1.inc;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		BiConsumer<Employee, Double>c=(e,increment)->e.salary=e.salary+increment;
		for(Employee e:l)
		{
			c.accept(e, 500.0);
		}
		
		for(Employee e:l)
		{
			System.out.println(e.name);
			System.out.println(e.salary);
		}
	}

	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}
