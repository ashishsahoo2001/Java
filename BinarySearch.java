public class BinarySearch {
    // Iterative method to perform binary search
    public int binarySearch(int[] arr, int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If x greater, ignore left half
            if (arr[mid] < x) {
                l = mid + 1;
            }
            // If x is smaller, ignore right half
            else {
                r = mid - 1;
            }
        }

        // If we reach here, element was not present
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40}; // Example array
        int n = arr.length;
        int x = 10; // Element to be searched
        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

