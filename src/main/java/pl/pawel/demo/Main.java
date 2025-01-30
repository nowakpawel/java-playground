package pl.pawel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        printDelimiter("Compilation completed");
    }

    private static void printDelimiter(String text) {
        System.out.println("\n======== " + text + " ========\n");
    }
}
