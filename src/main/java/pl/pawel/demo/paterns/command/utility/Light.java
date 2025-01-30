package pl.pawel.demo.paterns.command.utility;

public class Light {

    public void on() {
        System.out.println("The light is on");
    }

    public void off() {
        System.out.println("The light is off");
    }

    public void makeLighter() {
        System.out.println("Light is brighter");
    }

    public void makeDarker() {
        System.out.println("Light is darker");
    }
}
