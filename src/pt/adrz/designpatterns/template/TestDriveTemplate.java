package pt.adrz.designpatterns.template;

import java.util.Arrays;

import pt.adrz.designpatterns.template.pizza.MexicanPizza;
import pt.adrz.designpatterns.template.pizza.NoCheesePizza;
import pt.adrz.designpatterns.template.pizza.SweetCornPizza;
import pt.adrz.designpatterns.template.simplebarista.Coffee;
import pt.adrz.designpatterns.template.simplebarista.Tea;
import pt.adrz.designpatterns.template.sort.Duck;

public class TestDriveTemplate {
	
	public static void barista() {
		
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		
		tea.prepareRecipe();
		coffee.prepareRecipe();
	}
	
	public static void pizza() {
		
		SweetCornPizza p1 = new SweetCornPizza();
		MexicanPizza p2 = new MexicanPizza();
		NoCheesePizza p3 = new NoCheesePizza();
		
		p1.preparePizza();
		p2.preparePizza();
		p3.preparePizza();
	}
	
	public static void sort() {
		
		Duck[] ducks = {
			new Duck("Daffy", 8), 
			new Duck("Dewey", 2),
			new Duck("Howard", 7),
			new Duck("Louie", 2),
			new Duck("Donald", 10), 
			new Duck("Huey", 2)
		};
		
		System.out.println("Before sorting:");
		display(ducks);

		Arrays.sort(ducks);
 
		System.out.println("\nAfter sorting:");
		display(ducks);
	}
	
	private static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
