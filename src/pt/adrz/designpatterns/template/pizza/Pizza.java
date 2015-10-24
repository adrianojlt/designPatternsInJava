package pt.adrz.designpatterns.template.pizza;

public abstract class Pizza {
	
	public abstract void chooseBread();
	public abstract void addIngredients();

	public void heating() {
		System.out.println("Heating for 10 minutes!");
	}

	public void addCheese() {
		System.out.println("Adding Cheese!");
	}

	public void addTopinngs() {
		System.out.println("Adding Topinngs!");
	}
	
	public boolean isCheese() {
		return true;
	}

	/**
	 * Template Method
	 * This method follows the 'hollywood principle', 
	 * "Don't call us, we'll call you"
	 */
	public final void preparePizza() {

		chooseBread();
		addIngredients();
		heating();

		// ... a hook
		if ( isCheese() ) addCheese();

		addTopinngs();
	}
}
