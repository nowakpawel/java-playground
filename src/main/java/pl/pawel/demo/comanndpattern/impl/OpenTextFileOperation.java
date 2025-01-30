package pl.pawel.demo.comanndpattern.impl;

import pl.pawel.demo.comanndpattern.TextFile;
import pl.pawel.demo.comanndpattern.TextFileOperation;

public class OpenTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
