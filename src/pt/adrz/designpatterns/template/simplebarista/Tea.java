package pt.adrz.designpatterns.template.simplebarista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() { System.out.println("Steeping the tea"); }

	@Override
	public void addCondiments() { System.out.println("Adding Lemon"); }
	
	@Override
	public boolean customerWantsCondiments() {
		
		String answer = this.getUserInput();
		
		boolean yes = answer.toLowerCase().startsWith("y");
		
		if (yes) return true;
		else return false;
	}
	
	private String getUserInput() {

		String answer = null;

		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try { answer = in.readLine(); } 
		catch (IOException ioe) { System.err.println("IO error trying to read your answer"); }

		if (answer == null) { return "no"; }

		return answer;
	}
}
