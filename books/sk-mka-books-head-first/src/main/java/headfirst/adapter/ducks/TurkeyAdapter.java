package headfirst.adapter.ducks;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(final Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
