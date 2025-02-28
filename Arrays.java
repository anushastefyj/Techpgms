class Arrays

public class ArrayRotation {
    // Function to left rotate the array by 'd' positions
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;

        // Normalize rotations in case d > n
        d = d % n;

        // Reverse parts of the array
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Helper function to reverse an array segment
    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of rotations

        System.out.println("Original Array: " + Arrays.toString(arr));

        leftRotate(arr, d);

        System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
    }
}
