package pt.adrz.designpatterns.template.barista;

public class Coffee extends CaffeineBeverage{

	@Override
	public void brew() { System.out.println("Dripping Coffee through filter"); }

	@Override
	public void addCondiments() { System.out.println("Dripping Coffee through filter"); }
}
