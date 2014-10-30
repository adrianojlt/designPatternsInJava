package pt.adrz.designpatterns.factory.pizza;

public class TestDriveFactoryPizza {
	
	public static void start() {
		
		PizzaStore nyStore = new PizzaStoreNY();
		PizzaStore chicagoStore = new PizzaStoreChicago();
		
		Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}
}
