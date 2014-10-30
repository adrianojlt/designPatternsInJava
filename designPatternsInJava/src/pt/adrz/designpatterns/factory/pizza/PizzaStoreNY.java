package pt.adrz.designpatterns.factory.pizza;

public class PizzaStoreNY extends PizzaStore {
	
	public PizzaStoreNY() { }

	@Override
	protected Pizza createPizza(PizzaType type) {
		
		Pizza pizza = null;
		
		switch ( type ) {
		case CHEESE:
			pizza = new NYStyleCheesePizza(); 
			break;
		case PEPPERONE:
			break;
		case CLAM:
			pizza = new NYStyleClamPizza();
			break;
		case VEGGIE:
			break;
		default:
			break;
		}
		
		return pizza;
	}
}
