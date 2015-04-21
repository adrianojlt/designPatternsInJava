package pt.adrz.designpatterns.factory.pizza;

public class TestDriveFactoryPizza {
	
	public static void start() {
		
		Pizza pizza = null;
		
		PizzaStore nyStore = new PizzaStoreNY();
		PizzaStore chicagoStore = new PizzaStoreChicago();
		
		pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}
}
