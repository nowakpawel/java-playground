package pl.pawel.demo.paterns.command;

public class Invoker {
    ICommand on;
    ICommand off;
    ICommand up;
    ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        on.execute();
    }

    public void clickUp() {
        up.execute();
    }

    public void clickDown() {
       down.execute();
    }

    public void clickOff() {
        off.execute();
    }
}
