package autoboxing;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Test {
public static void main(String[] args) {
	/*IntFunction<Integer>f=i->i*i;
	System.out.println(f.apply(5));*/
	/*ToIntFunction<String>f=s->s.length();
	System.out.println(f.applyAsInt("Durga"));*/
	
	IntToDoubleFunction f=i->Math.sqrt(i);
	System.out.println(f.applyAsDouble(5));
}
}
