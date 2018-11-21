package BiPredicateFunIn.stu;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Test {
public static void main(String[] args) {
	ArrayList<Student>l=new ArrayList<Student>();
	BiFunction<String, Integer, Student>f=(name,rollno)->new Student(name, rollno);
		l.add(f.apply("Ganesh",100));
		l.add(f.apply("Ravi",200));
		l.add(f.apply("Durga",300));
		l.add(f.apply("Nilesh",400));
		for(Student s:l)
		{
			System.out.println("Student Name:"+s.name);
			System.out.println("Student Name:"+s.rollno);
			System.out.println();
		}
	
}
}
