package pt.adrz.designpatterns.decorator;

public abstract class Beverage {

	String description = "unknow beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}



	
