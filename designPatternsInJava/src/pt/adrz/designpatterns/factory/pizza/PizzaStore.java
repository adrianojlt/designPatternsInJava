package pt.adrz.designpatterns.factory.pizza;

/**
 * Here we have got a store waiting for subclasses. We are going to have
 * a subclass for each regional type (NYPizzaStore, ChicagoPizzaStore, CaliforniaPizzaStore) 
 * and each subclass is going to make a decision about what makes up a pizza. 
 * @author adriano
 *
 */
public abstract class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore() { }
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		// Notice that we've replaced the new operator with a create 
		// method on the factory object. No more concrete instantiation here
		//pizza = factory.createPizza(type);
		
		// ... now createPizza is back to being a call to a method in the PizzaStore (factory method)
		// rather than on a factory object ...
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// ... now we have moved our factory object to this method
	// all the responsibility for instantiating Pizzas has been moved into a method
	// that act as a factor
	protected abstract Pizza createPizza(String type);
}

