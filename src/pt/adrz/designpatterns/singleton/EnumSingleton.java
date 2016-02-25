package pt.adrz.designpatterns.singleton;

/**
 * A single element ENUM type is the best way to implement a Singleton
 * Equivalent to the public field approach, except that is more
 * concise, provides the serialization machinery for free, and provides 
 * an ironclad guarantee against multiple instantiations.
 * 
 * @author adriano
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	private int value;
	private String cenas = null;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setCenas(String cenas) {

		if ( this.cenas == null ) {
			this.cenas = cenas;
		}
	}

	public int getValue() {
		return this.value;
	}
	
	public String getCenas() {
		return cenas;
	}

	public void doSomething() {
		System.out.println("do something");
	}
	
	public static void main(String[] args) {

		EnumSingleton.INSTANCE.setCenas("one");
		EnumSingleton.INSTANCE.setCenas("two");
		EnumSingleton.INSTANCE.setValue(10);
		EnumSingleton.INSTANCE.setValue(11);

		System.out.println(EnumSingleton.INSTANCE.getCenas());
		System.out.println(EnumSingleton.INSTANCE.getValue());
	}
}
