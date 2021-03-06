package pt.adrz.designpatterns.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name, dough, sauce;
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	public Pizza() { }
	
	public void prepare() {
		System.out.println("Preparing ...");
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
}
