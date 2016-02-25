package pt.adrz.designpatterns.singleton;

/**
 * Simple Singleton Pattern
 * @author adriano
 */
public class ClassicSingleton {
	
	private static ClassicSingleton INSTANCE = null;
	
	private int value;
	
	protected ClassicSingleton() { }

	protected ClassicSingleton(int value) {
		this.value = value;
	}
	
	/**
	 * Eager initialization: only created when this method is called
	 * Its not Thread Safe
	 * @return
	 */
	public static ClassicSingleton getInstance() {

		if ( INSTANCE == null ) { 
			INSTANCE = new ClassicSingleton(); 
		}

		return INSTANCE;
	}

	public static ClassicSingleton getInstance(int value) {

		if ( INSTANCE == null ) { 
			INSTANCE = new ClassicSingleton(value); 
		}

		return INSTANCE;
	}
	
	public int getValue() {
		return this.value;
	}

	public static void main(String[] args) {
		ClassicSingleton.getInstance(12);
		ClassicSingleton.getInstance(11);
		System.out.println(ClassicSingleton.getInstance().getValue());
		//System.out.println(ClassicSingleton.getInstance(10).getValue());
	}
}
