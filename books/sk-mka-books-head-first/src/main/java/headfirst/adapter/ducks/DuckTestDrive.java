package headfirst.adapter.ducks;

public class DuckTestDrive {
	public static void main(final String[] args) {
		MallardDuck duck = new MallardDuck();
 
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
   
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
 
		System.out.println("\nThe Duck says...");
		testDuck(duck);
  
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
 
	static void testDuck(final Duck duck) {
		duck.quack();
		duck.fly();
	}
}
