package pt.adrz.designpatterns.decorator;

public class TestDriveCoffeDecorator {
	
	public static void start() {
		
		// order an expresso with no condiments
		Beverage espresso = new Espresso();
		
		System.out.println(espresso.getDescription() + " �" + espresso.cost());
		
		// order a HouseBlend ...
		Beverage houseBlend = new HouseBlend(); 
		
		houseBlend = new CondimentMilk(houseBlend);	// ... wrap it with Milk
		houseBlend = new CondimentSoy(houseBlend);	// ... wrap it with Soy
		
		System.out.println(houseBlend.getDescription() + " �" + houseBlend.cost());
		
		// order a Decaf ...
		Beverage decaf = new Decaf();
		
		decaf = new CondimentMilk(decaf); 	// ... wrap it with Milk
		decaf = new CondimentMilk(decaf); 	// ... wrap it with more Milk
		decaf = new CondimentSoy(decaf); 	// ... wrap it with Soy
		
		System.out.println(decaf.getDescription() + " �" + decaf.cost());
	}

}
