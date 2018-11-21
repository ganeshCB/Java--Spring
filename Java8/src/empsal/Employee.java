package empsal;

public class Employee {
String name;
double salary;
public Employee(String name,Double salary) {
	this.name=name;
	this.salary=salary;
	
}

public String toString()
{
	return name+" :"+salary;
}
}
