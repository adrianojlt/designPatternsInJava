package pt.adrz.designpatterns.singleton;

/**
 * Before Java 1.6 a singleton class  
 * can be defined like the following.
 * @author adriano
 */
public class ClassicSingleton {
	
	private static ClassicSingleton instance = null;
	
	protected ClassicSingleton() { }
	
	/**
	 * Eager initialization: only created when this method is called
	 * Its not Thread Safe
	 * @return
	 */
	public static ClassicSingleton getInstance() {
		if ( instance == null ) { instance = new ClassicSingleton(); }
		return instance;
	}
}
