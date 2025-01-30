package pl.pawel.demo.comanndpattern;

import pl.pawel.demo.comanndpattern.impl.OpenTextFileOperation;
import pl.pawel.demo.comanndpattern.impl.SaveTextFileOperation;

public class Client {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        String open = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));

        String save = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));

        System.out.println(open);
        System.out.println("\n");
        System.out.println(save);
    }
}
