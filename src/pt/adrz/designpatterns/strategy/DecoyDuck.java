package pt.adrz.designpatterns.strategy;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm a duck Decoy");
	}

}
