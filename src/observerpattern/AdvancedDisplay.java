package observerpattern;

/**
 * Created by hiteshs on 2/20/18.
 */
public class AdvancedDisplay implements Observer{
    private WeatherStation station;

    public AdvancedDisplay(WeatherStation station){
        this.station=station;
    }
    @Override
    public void update() {
        if(this.station.getTemperature()>30 && this.station.getHumidity()>80 && this.station.getPressure()>120){
            System.out.println("Its going to rain today");
        }
        else{
            System.out.println("Good weather to go out today");
        }


    }
}
