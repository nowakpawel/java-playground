package pl.pawel.demo.paterns.observer;

import pl.pawel.demo.paterns.observer.implemention.PhoneDisplay;
import pl.pawel.demo.paterns.observer.implemention.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay display = new PhoneDisplay(station);

        station.addObserver(display);
    }

}
