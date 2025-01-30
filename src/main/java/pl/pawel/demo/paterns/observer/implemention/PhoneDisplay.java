package pl.pawel.demo.paterns.observer.implemention;
import pl.pawel.demo.paterns.observer.structure.Observer;

public class PhoneDisplay implements Observer {
    private final WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println(this.station.getTemperature());
    }
}
