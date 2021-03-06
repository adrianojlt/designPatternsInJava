package pt.adrz.designpatterns.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
