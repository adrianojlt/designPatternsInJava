package pt.adrz.designpatterns.template.simplebarista;

public abstract class CaffeineBeverage {

	// ... final to avoid override by subclasses

	/**
	 * A template method defines an algorithm in a base class using abstract operations that 
	 * subclasses override to provide concrete behavior. 
	 * ... final to avoid override by subclasses
	 */
	public final void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.pourInCup();
		if (customerWantsCondiments())
			this.addCondiments();
	}
	
	// primitive operations ... these must be implemented by concrete subclasses
	public abstract void brew();
	public abstract void addCondiments();
	
	// concrete operations
	private void boilWater() { System.out.println("Boiling water"); }
	private void pourInCup() { System.out.println("Pouring into cup"); }
	
	public boolean customerWantsCondiments() {
		return true;
	}
}
