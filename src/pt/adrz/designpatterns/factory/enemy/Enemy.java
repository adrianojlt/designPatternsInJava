package pt.adrz.designpatterns.factory.enemy;

public abstract class Enemy {

	double health;
	int Ammo;

	public abstract void attack();

	public Double getHealth() { return this.health; }
	public void setHealth(double newHealth) { this.health = newHealth; }

}
