package BiPredicateFunIn.emp;

import java.util.function.BiFunction;

public class Test {
	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
		Employee e = new Employee(101, "Durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		System.out.println("Employee Monthly Salary:" + f.apply(e, t));
		System.out.println("Monthly Salry:" + f.apply(e, t));
	}
}
