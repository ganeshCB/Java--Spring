package suppliercon;

import java.util.function.Supplier;

public class Test1 {
	public static void main(String[] args) {
		Supplier<String>s=()->
		{
			String[] s1= {"sunyy","bunny","chiiny","vinny"};
			int x=(int)(Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
