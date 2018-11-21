package consumer.stu;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		
		Predicate<Student>p=s->s.marks>=60;
		Function<Student, String>f=s->{
			int marks=s.marks;
			if(marks>=80)
			{
				return "A";
			}
			else if(marks>=60)
			{
				return "B";
			}
			else if(marks>=50)
			{
				return "C";
			}
			else if(marks>=35)
			{
				return "D";
			}
			else
			{
				return "E";
			}
		};
		
		Consumer<Student>c=s->
		{
			System.out.println("Name :"+ s.name);
			System.out.println("Mark :"+ s.marks);
			System.out.println("Grade: "+f.apply(s));
		};
		
		for(Student s:l)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
	}

	public static void populate(ArrayList<Student> l) {
		l.add(new Student("Sunny", 100));
		l.add(new Student("Bunny", 65));
		l.add(new Student("Chinny", 55));
		l.add(new Student("Vinny", 45));
		l.add(new Student("Pinny", 25));
	}
}
