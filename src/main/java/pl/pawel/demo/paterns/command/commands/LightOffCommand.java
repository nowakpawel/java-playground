package pl.pawel.demo.paterns.command.commands;

import pl.pawel.demo.paterns.command.ICommand;
import pl.pawel.demo.paterns.command.utility.Light;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();

    }

    @Override
    public void unexecute() {
        this.light.on();
    }
}
