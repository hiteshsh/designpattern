package observerpattern;

/**
 * Created by hiteshs on 2/20/18.
 */
public class SimpleDisplay implements Observer {
    private WeatherStation station;

    public SimpleDisplay(WeatherStation station){
        this.station=station;
    }
    @Override
    public void update() {
        System.out.println("Weather details :"+ this.station.getTemperature()+" "+
        this.station.getHumidity() +" "+this.station.getPressure());

    }
}
