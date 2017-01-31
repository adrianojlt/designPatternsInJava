package pt.adrz.designpatterns.observer.weather;

public class TestDriveObserver {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		// create the "displays" and pass the weatherData obj
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// simulate the weather measurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 23.2f);
		weatherData.setMeasurements(78, 45, 40.4f);
	}

}
