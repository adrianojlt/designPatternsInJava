package pt.adrz.designpatterns.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement{

	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;
	
	/**
	 * this observer will be registered in the given subject 
	 * @param weatherData - The subject
	 */
	public ForecastDisplay(WeatherData weatherData) {
		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		display();
	}
	
	public void display() {
		
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) { System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) { System.out.println("More of the same");
		} else if (currentPressure < lastPressure) { System.out.println("Watch out for cooler, rainy weather"); }
	}
}
