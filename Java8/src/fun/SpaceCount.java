package fun;

import java.util.function.Function;

public class SpaceCount {
	public static void main(String[] args) {
		//remove blan spaces
		String s="Durga Software Solution Hyderabad";
		Function<String, String> f=s1->s1.replaceAll(" ", "");
		System.out.println(f.apply(s));
		
		System.out.println("******************************************");
		
		Function<String, Integer>f2=s2->s2.length()-s2.replaceAll(" ", "").length();
		System.out.println("spaces "+ f2.apply(s));
		
	}

}
