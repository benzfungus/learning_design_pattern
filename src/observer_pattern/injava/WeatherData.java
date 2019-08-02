package observer_pattern.injava;

import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {}
    
    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // 用pull的方式让观察者自己来拿数据
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public float getTemperature() {
        return temperature;
    }
    
    public float getHumidity() {
        return humidity;
    }
    
    public float getPressure() {
        return pressure;
    }

}
