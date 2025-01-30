package pl.pawel.demo.paterns.command.commands;

import pl.pawel.demo.paterns.command.ICommand;
import pl.pawel.demo.paterns.command.utility.Light;

public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();

    }

    @Override
    public void unexecute() {
        this.light.off();

    }
}
