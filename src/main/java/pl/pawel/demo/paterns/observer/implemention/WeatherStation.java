package pl.pawel.demo.paterns.observer.implemention;

import pl.pawel.demo.paterns.observer.structure.Observable;

public class WeatherStation extends Observable {
  private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
