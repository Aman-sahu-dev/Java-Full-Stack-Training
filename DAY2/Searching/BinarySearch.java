package DAY2.Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == target) {
                return middle; // Return the index of the target element
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 7, 9};
        int target = 7;
        int result = binarySearch(numbers, target);
        System.out.println("Element found at index: " + result); // Output: Element found at index: 4
    }
}

