package observer_pattern.injava;

import java.util.Observable;
import java.util.Observer;

import observer_pattern.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable Observable;
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable observable) {
        this.Observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}
