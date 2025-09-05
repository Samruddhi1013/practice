public class CheckedSortedRecursion {
    public static boolean isSorted(int arr[], int n) {
        // Base case: if only 1 element left → sorted
        if (n == 1) {
            return true;
        }

        // Check last two elements
        if (arr[n] < arr[n - 1]) {
            return false;
        }

        // Recursively check the rest
        return isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        int n = arr.length-1;

        boolean result = isSorted(arr, n);
        System.out.println(result);  // false
    }
}
