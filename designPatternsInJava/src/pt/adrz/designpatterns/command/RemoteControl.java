package pt.adrz.designpatterns.command;

public class RemoteControl {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		this.command.execute();
	}
}
