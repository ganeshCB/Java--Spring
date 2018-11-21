package consumer.movie;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie>c=m->{
			System.out.println("Movie names:"+m.name);
			System.out.println("Movie hero:"+m.hero);
			System.out.println("Movie heroine:"+m.heroine);
			System.out.println();
		};
		
		for(Movie m:l)
		{
			c.accept(m);
		}
	}

	public static void populate(ArrayList<Movie> l) {

		l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		l.add(new Movie("Rayees", "Sharukh", "Sunny"));
		l.add(new Movie("Dangal", "Ameer", "Ritu"));
		l.add(new Movie("Sultan", "Salman", "Anushka"));
	}
}
