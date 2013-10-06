package pt.adrz.designpatterns.strategy;

public class ModelDuck extends Duck {
	
	@SuppressWarnings("unused")
	private FlyBehavior flyBehavior;

	@SuppressWarnings("unused")
	private QuackBehavior quackBehavior;
	
	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'am a model duck");
	}
}
