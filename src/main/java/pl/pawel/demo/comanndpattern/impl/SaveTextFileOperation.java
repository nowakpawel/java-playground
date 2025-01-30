package pl.pawel.demo.comanndpattern.impl;

import pl.pawel.demo.comanndpattern.TextFile;
import pl.pawel.demo.comanndpattern.TextFileOperation;

public class SaveTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
