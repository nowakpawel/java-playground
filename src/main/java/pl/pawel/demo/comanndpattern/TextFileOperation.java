package pl.pawel.demo.comanndpattern;

/*
        https://www.baeldung.com/java-command-pattern?fbclid=IwAR1h7hT92yaoSMUPLVSwxbMdDO1Ydvt3Ocms4Cgcvkny-kliRYfv5sPpzyU
 */

@FunctionalInterface
public interface TextFileOperation {
    String execute();
}
