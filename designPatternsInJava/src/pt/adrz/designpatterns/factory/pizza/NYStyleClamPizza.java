package pt.adrz.designpatterns.factory.pizza;

public class NYStyleClamPizza extends Pizza{

	public NYStyleClamPizza() {

		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Mariara Sauce";

		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
	
	//@Override
	//public void cut() { System.out.println("Cutting the pizza into square slices"); }
}
