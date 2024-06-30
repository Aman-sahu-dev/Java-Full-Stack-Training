package DAY2.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};
        insertionSort(numbers);
        System.out.println("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Output: Sorted array: 5 6 11 12 13 
    }
}

