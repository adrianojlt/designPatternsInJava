package pt.adrz.designpatterns.factory.pizza;

/**
 * A Simple Pizza Store that doesn't use a Factory
 * Remember to make the implementation "OPEN FOR EXTENSION, CLOSE FOR MODIFICATION"
 * @author adriano
 *
 */
public class DependentPizzaStore {

	public Pizza createPizza(String stype, String type) {
		
		Pizza pizza = null;

		if ( "NY".equals(stype) ) {
			if ( "cheese".equals(type) )
				pizza = new NYStyleCheesePizza();
			if ( "veggie".equals(type) )
				pizza = null;
			if ( "clam".equals(type) )
				pizza = new NYStyleClamPizza();
			if ( "pepperoni".equals(type) )
				pizza = null;
		}
		
		if ( "CHICAGO".equals(stype) ) {
			if ( "cheese".equals(type) )
				pizza = new ChicagoStyleCheesePizza();
			if ( "veggie".equals(type) )
				pizza = null;
			if ( "clam".equals(type) )
				pizza = null;
			if ( "pepperoni".equals(type) )
				pizza = new ChicagoStylePepperoniPizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
