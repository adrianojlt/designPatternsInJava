package pt.adrz.designpatterns.singleton;

/**
 * Before Java 1.6 a class which should be a singleton can be defined like the following.
 * @author adriano
 */
public class ClassicSingleton {
	
	private static ClassicSingleton instance = null;
	
	protected ClassicSingleton() { }
	
	public static ClassicSingleton getInstance() {
		if ( instance == null ) { instance = new ClassicSingleton(); }
		return instance;
	}
}
