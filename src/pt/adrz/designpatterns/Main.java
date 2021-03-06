package pt.adrz.designpatterns;

import pt.adrz.designpatterns.decorator.TestDriveCoffeDecorator;
import pt.adrz.designpatterns.facade.hometheater.TestDriveFacadeHomeTheater;
import pt.adrz.designpatterns.factory.dao.TestDriveFactoryDAO;
import pt.adrz.designpatterns.factory.pizza.TestDriveFactoryPizza;
import pt.adrz.designpatterns.observer.SwingObserverExample;
import pt.adrz.designpatterns.template.TestDriveTemplate;

public class Main {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		
		//TestDriveFactoryDAO.start();
		//TestDriveFacadeHomeTheater.start();
		//TestDriveFactoryPizza.start();
		//TestDriveTemplate.sort();
		TestDriveCoffeDecorator.start();

		//DesignPatterns dp = new DesignPatterns();
		//dp.adapterDuck();
		//dp.templateBeverageTest();
	}
}
