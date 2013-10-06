package pt.adrz.designpatterns.strategy;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
