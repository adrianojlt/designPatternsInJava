package pt.adrz.designpatterns.adapter.duck;

public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("gobble gobble");
	}

	public void fly() {
		System.out.println("I am flying a short distance");
	}
}
