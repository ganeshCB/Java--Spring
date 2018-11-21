package consumer.channing;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<Movie>c1=m->System.out.println("Movie:"+m.name+"is ready to relase");
		Consumer<Movie>c2=m->System.out.println("Movie:"+m.name+"is ready to relase"+m.result);
		Consumer<Movie>c3=m->System.out.println("Movie:"+m.name+"information storing in the database");
		Consumer<Movie>chaindC=c1.andThen(c2).andThen(c3);
		Movie m1=new Movie("Bahubali", "Hit");
		chaindC.accept(m1);
		
		Movie m2=new Movie("Sultan", "flop");
		chaindC.accept(m2);
	}

}
