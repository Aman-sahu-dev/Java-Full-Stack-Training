package DAY2.Searching;

public class LinearSearch {
    // linear search algorithm
    public static int linearSearch(int arr[], int n, int val) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }
    // driver code main method
    public static void main(String args[]) {
        int arr[] = { 12, 25, 8, 10, 32 };
        int x = 8;
        // function call
        int result = linearSearch(arr, arr.length, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index : " + result);
    }
}

