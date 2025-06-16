/**
 * Performs binary search and linear search on a sorted array.
 * @param arr The sorted array.
 * @param x The element to find.
 * @return Index of x or -1 if not found.
 */

package Algorithms.Searching;

class BinaryAndLinear {

    // time complexity - o (n), space complexity - o(1)
    static int linear_search(int arr[], int n, int x) {
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // time complexity - o log(n) , space complexity - o(1)
    static int binary_search(int arr[], int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            // in traditional binary_search we use int mid = (l + r) / 2 although this is
            // correct but as the input increases it can cause to throw an as to how the
            // function is interpreted
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 4;
        int n = arr.length;
        // Measuring time and space
        // binary
        // space
        Runtime runtime1 = Runtime.getRuntime();
        runtime1.gc();
        Long memoryBeforeB = runtime1.totalMemory() - runtime1.freeMemory();
        // time
        Long startTimeB = System.nanoTime();
        int index = binary_search(arr, n, x);
        Long endTimeB = System.nanoTime();
        Long memoryAfterB = runtime1.totalMemory() - runtime1.freeMemory();
        Long memoryUsedB = memoryAfterB - memoryBeforeB;
        // Linear
        Runtime runtime2 = Runtime.getRuntime();
        runtime2.gc();
        Long memoryBeforeL = runtime2.totalMemory() - runtime2.freeMemory();
        // time
        Long startTimeL = System.nanoTime();
        int index2 = linear_search(arr, n, x);
        Long endTimeL = System.nanoTime();
        // space
        Long memoryAfterL = runtime2.totalMemory() - runtime2.freeMemory();
        Long memoryUsedL = memoryAfterL - memoryBeforeL;

        if (index == -1 || index2 == -1) {
            System.err.println("Element not found: " + x);
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Element found at index (binary_search): " + index);
            System.out.println("Binary Search Time: " + (endTimeB - startTimeB) + " ns");
            System.out.println("Binary Search Memory Used: " + memoryUsedB + " bytes");
            System.out.println("Binary Search Memory Used: " + (memoryUsedB / 1024) + " kb");

            System.out.println("------------------------------------------");
            System.out.println("Element found at index (linear_search): " + index2);
            System.out.println("Linear Search Time: " + (endTimeL - startTimeL) + " ns");
            System.out.println("Linear Search Memory Used: " + memoryUsedL + " bytes");
            System.out.println("Linear Search Memory Used: " + (memoryUsedL / 1024) + " kb");
            System.out.println("------------------------------------------");
        }
    }
}
// while both binary_Search and linear_Search are o(1) space their memory usage
// may differ solely how the jvm interprets them ... try swapping both the
// function and that way the one running earlier is doomed to have more memory
// usage
// so in theory both have a space complexity of o(1) while binary_Search has a
// time complexity of o log(n) due to how it cuts the time required in half and
// linear having o (n) due to it iterating the whole of array.