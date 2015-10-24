package pt.adrz.designpatterns.command;

public class LightOnCommand implements Command{
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.switchOn();
	}

}
