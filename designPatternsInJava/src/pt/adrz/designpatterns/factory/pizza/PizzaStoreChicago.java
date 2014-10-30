package pt.adrz.designpatterns.factory.pizza;

public class PizzaStoreChicago extends PizzaStore{
	
	public PizzaStoreChicago() { }

	@Override
	protected Pizza createPizza(PizzaType type) {
		
		Pizza pizza = null;

		switch ( type ) {
		case CHEESE:
			pizza = new ChicagoStyleCheesePizza();
			break;
		case PEPPERONE:
			pizza = new ChicagoStylePepperoniPizza();
			break;
		case CLAM:
			break;
		case VEGGIE:
			break;
		default:
			break;
		}
		
		return pizza;
	}
}
