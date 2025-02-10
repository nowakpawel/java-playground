package pl.pawel.demo.algotithms;


import java.util.ArrayList;
import java.util.List;

public class Algorithms {
    public int binarySearch(int[] arr, int itemToFind) {
        int low = 0;
        int size = arr.length;
        int high = size -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int middleElement = arr[mid];

            if (middleElement == itemToFind) {
                return mid;
            }

            if (middleElement > itemToFind) {
                high = mid - 1;
            }

            if (middleElement < itemToFind) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public List<Integer> selectionSort(List<Integer> unsorted) {
        int size = unsorted.size();

        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Integer smallest = findSmallestElement(unsorted);
            newArray.add(unsorted.get(smallest));
            unsorted.remove((int) smallest);
        }

            return newArray;
    }

    public List<Integer> quickSort(List<Integer> unsortedList) {
        int size = unsortedList.size();
        List<Integer> less;
        List<Integer> greater;

        List<Integer> sorted = new ArrayList<>();

        if (size < 2) {
            return unsortedList;
        } else {
            Integer pivot = unsortedList.get(0);
            less = findAllSmallest(pivot, unsortedList);
            greater = findAllGreater(pivot, unsortedList);

            sorted.addAll(quickSort(less));
            sorted.addAll(List.of(pivot));
            sorted.addAll(quickSort(greater));
        }

        return sorted;
    }

    private List<Integer> findAllSmallest(Integer pivot, List<Integer> list) {
        List<Integer> less = new ArrayList<>();

        for (Integer integer: list) {
            if (integer < pivot) {
                less.add(integer);
            }
        }

        return less;
    }

    private List<Integer> findAllGreater(Integer pivot, List<Integer> list) {
        List<Integer> greater = new ArrayList<>();

        for (Integer integer: list) {
            if (integer > pivot) {
                greater.add(integer);
            }
        }

        return greater;
    }

    private int findSmallestElement(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
