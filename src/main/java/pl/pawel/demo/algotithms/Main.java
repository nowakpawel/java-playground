package pl.pawel.demo.algotithms;


public class Main {
    private static Algorithms algorithms = new Algorithms();
    public static void main(String[] args) {
        printDelimiter("Binary Search");

        int[] orderedArray = {-5, -3, 0, 1, 2, 5, 8, 9, 11};
        System.out.println(algorithms.binarySearch(orderedArray, -3));

    }

    public static void printDelimiter(String text) {
        System.out.printf("\n=+=+=+=+=+=+=+=+= %s =+=+=+=+=+=+=+=+=\n".formatted(text));
    }
}
