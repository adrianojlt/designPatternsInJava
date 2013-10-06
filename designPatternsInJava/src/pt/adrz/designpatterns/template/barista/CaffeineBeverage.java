package pt.adrz.designpatterns.template.barista;

public abstract class CaffeineBeverage {

	// ... final to avoid override by subclasses
	public final void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addCondiments();
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	private void boilWater() { System.out.println("Boiling water"); }
	private void pourInCup() { System.out.println("Pouring into cup"); }
}
