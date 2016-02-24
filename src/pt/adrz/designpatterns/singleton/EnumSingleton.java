package pt.adrz.designpatterns.singleton;

/**
 * A single element enum type is the best way to implement 
 * a Singleton
 * Equivalent to the public field approach, except that is more
 * concise, provides the serialization machinery for free, and provides 
 * an ironclad guarantee against multiple instantiations.
 * 
 * @author adriano
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	public void doSomething() {
		System.out.println("do something");
	}
	
	public static void main(String[] args) {
		EnumSingleton.INSTANCE.doSomething();
	}
}
