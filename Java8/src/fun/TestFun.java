package fun;

import java.util.function.Function;

public class TestFun {
public static void main(String[] args) {
	Function<String, Integer>f=s->s.length();
	System.out.println(f.apply("Ganesh"));
	System.out.println(f.apply("Ganesh Bhaware"));
	
	//Square
	System.out.println("****************************************");
	Function<Integer, Integer>f1=i->i*i;
	System.out.println(f1.apply(5));
	System.out.println(f1.apply(10));
	
}
}
