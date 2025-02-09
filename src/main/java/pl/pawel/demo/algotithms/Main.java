package pl.pawel.demo.algotithms;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static Algorithms algorithms = new Algorithms();
    public static void main(String[] args) {
        printDelimiter("Binary Search");

        int[] orderedArray = {-5, -3, 0, 1, 2, 5, 8, 9, 11};
        System.out.println(algorithms.binarySearch(orderedArray, -3));

        printDelimiter("Selection Sort");
        ArrayList<Integer> unsorted = new ArrayList<>(Arrays.asList(1, -2, 5, 7, 16, -4, 0, 19, 9, 10, 21));

        System.out.println("Unsorted array:\t" + unsorted);
        System.out.println("SortedList:\t" + algorithms.selectionSort(unsorted));


    }

    public static void printDelimiter(String text) {
        System.out.printf("\n=+=+=+=+=+=+=+=+= %s =+=+=+=+=+=+=+=+=\n".formatted(text));
    }
}
