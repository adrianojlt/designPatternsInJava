package pt.adrz.designpatterns;

import java.util.Arrays;

import pt.adrz.designpatterns.adapter.duck.*;
import pt.adrz.designpatterns.command.*;
import pt.adrz.designpatterns.decorator.*;
import pt.adrz.designpatterns.facade.hometheater.*;
import pt.adrz.designpatterns.factory.pizza.*;
import pt.adrz.designpatterns.observer.*;
import pt.adrz.designpatterns.observer.weather.*;
import pt.adrz.designpatterns.template.barista.*;

public class DesignPatterns {

	public DesignPatterns() { }
	
	public void tmp() { }
	
	public void RemoteControlTest() {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
	
	public void templateSort() {
		
		pt.adrz.designpatterns.template.sort.Duck[] ducks = { 
			new pt.adrz.designpatterns.template.sort.Duck("Daffy", 8),
			new pt.adrz.designpatterns.template.sort.Duck("Dewey", 2),
			new pt.adrz.designpatterns.template.sort.Duck("Howard", 7),
			new pt.adrz.designpatterns.template.sort.Duck("Louie", 2),
			new pt.adrz.designpatterns.template.sort.Duck("Donald", 10),
			new pt.adrz.designpatterns.template.sort.Duck("Huey", 10),
		};
		
		System.out.println("Before sorting:");
		for (int i = 0; i < ducks.length; i++) { System.out.println(ducks[i]); }
		
		Arrays.sort(ducks);

		System.out.println("After sorting:");
		for (int i = 0; i < ducks.length; i++) { System.out.println(ducks[i]); }
	}
	
	public void templateBeverageTest() {
		
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		
		tea.prepareRecipe();
		coffee.prepareRecipe();
	}
	
	public void strategyPattern() {
		
	}
	
	public void facadePattern() {

		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("tuner", amp);
		DvdPlayer dvd = new DvdPlayer("dvd", amp);
		CdPlayer cd = new CdPlayer("cd", amp);
		Projector projector = new Projector("projector", dvd);
		Screen screen = new Screen("screen");
		TheaterLights lights = new TheaterLights("lights");
		PopcornPopper popper = new PopcornPopper("popper");

		HomeTheaterFacade homeTheatet = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		
		homeTheatet.watchMovie("Raiders of the lost ark");
		homeTheatet.endMovie();
	}
	
	public void adapterDuck() {
		
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		turkey.gobble();
		turkey.fly();
		
		duck.quack();
		duck.fly();
		
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
	
	public void commandPattern() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		// switch On
		remoteControl.setCommand(lightsOn);
		remoteControl.pressButton();
		
		// switch Off
		remoteControl.setCommand(lightsOff);
		remoteControl.pressButton();
	}
	
	public void swingObserver() {
		new SwingObserverExample();
	}
	
	public void coffeDecorator() {
		
		// order an expresso with no condiments
		Beverage espresso = new Espresso();
		
		System.out.println(espresso.getDescription() + " €" + espresso.cost());
		
		// order a HouseBlend ...
		Beverage houseBlend = new HouseBlend(); 
		
		houseBlend = new CondimentMilk(houseBlend);	// ... wrap it with Milk
		houseBlend = new CondimentSoy(houseBlend);	// ... wrap it with Soy
		
		System.out.println(houseBlend.getDescription() + " €" + houseBlend.cost());
		
		// order a Decaf ...
		Beverage decaf = new Decaf();
		
		decaf = new CondimentMilk(decaf); 	// ... wrap it with Milk
		decaf = new CondimentMilk(decaf); 	// ... wrap it with more Milk
		decaf = new CondimentSoy(decaf); 	// ... wrap it with Soy
		
		System.out.println(decaf.getDescription() + " €" + decaf.cost());
	}
	
	public void pizzaFactory() {
		
		PizzaStore nyStore = new NYPizzaStore();
	}
	
	public void weatherObserver() {
		
		WeatherData weatherData = new WeatherData();
		
		// create the "displays" and pass the weatherData obj
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// simulate the weather measurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 23.2f);
		weatherData.setMeasurements(78, 45, 40.4f);
	}
	
	public void homeTheaterTestDrive() {
		
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
