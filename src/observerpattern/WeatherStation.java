package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hiteshs on 2/20/18.
 */
public class WeatherStation implements Observable {
    List<Observer> lisofObservers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherStation(){
        lisofObservers= new ArrayList<>();
    }
    @Override
    public void add(Observer observer) {
        lisofObservers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        lisofObservers.remove(lisofObservers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer obser:
             lisofObservers) {
            obser.update();
        }
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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
