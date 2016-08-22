package pt.adrz.designpatterns.factory.pizza;

public class TestDriveFactoryPizza {
	
	public static void factory() {
		
		Pizza pizza = null;
		
		PizzaStore nyStore = new PizzaStoreNY();
		PizzaStore chicagoStore = new PizzaStoreChicago();
		
		pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza(PizzaType.PEPPERONE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}
	
	public static void dependent() {
		
		DependentPizzaStore dps = new DependentPizzaStore();
		Pizza pizza = dps.createPizza("NY", "cheese");
		System.out.println("Ethan ordered a dependent " + pizza.getName() + "\n");
		
	}
	
	public static void main(String[] args) {
		//factory();
		dependent();
	}
}
