package pl.pawel.demo.paterns.command.commands;

import pl.pawel.demo.paterns.command.ICommand;
import pl.pawel.demo.paterns.command.utility.Light;

public class DownCommand implements ICommand {
    private Light light;

    public DownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.makeDarker();

    }

    @Override
    public void unexecute() {
        light.makeLighter();
    }
}
