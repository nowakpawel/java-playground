package pl.pawel.demo.paterns.command.commands;

import pl.pawel.demo.paterns.command.ICommand;
import pl.pawel.demo.paterns.command.utility.Light;

public class UpCommand implements ICommand {
    private Light light;

    public UpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.makeLighter();
    }

    @Override
    public void unexecute() {
        light.makeDarker();
    }
}
