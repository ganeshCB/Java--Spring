package student.grade;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student>l=new ArrayList<Student>();
		populate(l);
		Function<Student, String>f=s->{
			int marks=s.marks;
			if(marks>=80) {
				return "A[Distinction]";
			}
			else if(marks<=60)
			{
				return "B[First Class]";
			}
			else if(marks>=50)
			{
				return "C[Second Class]";
			}
			else if(marks>=35)
			{
				return "D[Third class]";
			}
			else {
				return "E Failed";
			}
		};
		
		Predicate<Student>p=s->s.marks>=60;
		
		for(Student s:l)
		{
			if(p.test(s))
			{
			System.out.println("Name:"+s.name);
			System.out.println("Marks:"+s.marks);
			System.out.println("Grade:"+f.apply(s));
			System.out.println();
			}
		}
		
		
		}
		
	

	public static void populate(ArrayList<Student>l) {
		l.add(new Student("ganesh", 60));
		l.add(new Student("mohan", 40));
		l.add(new Student("Rakesh", 80));
		l.add(new Student("Koshail", 35));
		l.add(new Student("Durgesh", 30));
		
		
	}
}
