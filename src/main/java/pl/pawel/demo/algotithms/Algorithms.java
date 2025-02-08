package pl.pawel.demo.algotithms;

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
}
