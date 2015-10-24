package pt.adrz.designpatterns.decorator;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.description = "House Blend Coffe";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
