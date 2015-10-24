package pt.adrz.designpatterns.adapter.duck;

/**
 * First, you need to implement the interface of the type you are
 * adapting to. This is the interface your client expects to see. 
 * @author adriano
 */
public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	/**
	 * We need a reference to the object that we are adpting.
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble(); // the translation here is easy ... just call gobble
	}

	public void fly() {
		
		// turkey fly in short spurts ... they dont fly long distances like ducks ...
		// ... so we need to call the turkeys fly 5 times
		for( int i = 0; i < 5; i++ ) {
			turkey.fly();
		}
	}

}
