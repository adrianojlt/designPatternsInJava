package pt.adrz.designpatterns.factory.pizza;

public class TestDriveFactoryPizza {
	
	public static void start() {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("calm");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	}
}
