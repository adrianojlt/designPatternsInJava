package pt.adrz.designpatterns.strategy;



public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() { }
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
	
	public void performFly() {
		flyBehavior.fly(); // delegate to the behavior class
	}
	
	public void quack() {
		quackBehavior.quack(); // delegate to the behavior class
	}
	
}


	
	