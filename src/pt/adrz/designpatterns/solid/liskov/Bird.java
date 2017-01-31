package pt.adrz.designpatterns.solid.liskov;

public abstract class Bird {
	
	protected Double x, y, z = 0.0;
	
	public abstract void setLocation(Double longitude, double latitude);
	public abstract void draw();
}

