package functionchaning;

import java.util.function.Function;

public class Test3 {
public static void main(String[] args) {
	Function<String, String>f=Function.identity();
	System.out.println(f.apply("ganesh"));
}
}
