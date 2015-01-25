package pt.adrz.designpatterns.template.pizza;

public class MexicanPizza extends Pizza{

	@Override
	public void chooseBread() {
		System.out.println("Choosing Mexican Pizza Bread!");	
	}

	@Override
	public void addIngredients() {
		System.out.println("Adding Mexican Pizza Ingredients!");
	}
}
