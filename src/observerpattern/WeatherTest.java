package observerpattern;

/**
 * Created by hiteshs on 2/20/18.
 */
public class WeatherTest {

    public static void main(String[] args) {
        WeatherStation station= new WeatherStation();
        station.setTemperature(25);
        station.setHumidity(23);
        station.setPressure(100);

        SimpleDisplay display1= new SimpleDisplay(station);
        station.add(display1);
        station.notifyObservers();

        station.setTemperature(35);
        station.setHumidity(83);
        station.setPressure(130);

        AdvancedDisplay display2= new AdvancedDisplay(station);
        station.add(display2);
        station.notifyObservers();

    }
}
