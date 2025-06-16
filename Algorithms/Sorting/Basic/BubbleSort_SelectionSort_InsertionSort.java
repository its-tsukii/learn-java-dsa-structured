package Algorithms.Sorting.Basic;

import java.util.Arrays;

class BubbleSort_SelectionSort_InsertionSort {

    static int[] bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            boolean swapped_flag = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped_flag = true;
                }
            }
            if (swapped_flag == false) {
                break;
            }
        }
        // System.out.println("After Bubble Sort : " + Arrays.toString(arr));
        return arr;
    }

    static int[] selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        // System.out.println("After Selection Sort : " + Arrays.toString(arr));
        return arr;
    }

    static int[] insertion_sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        // System.out.println("After Insertion Sort : " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int n = arr.length;
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        System.out.println("------------------------------------------");
        // Bubble ----
        Runtime runtimeB = Runtime.getRuntime();
        runtimeB.gc();
        Long memoryBeforeB = runtimeB.totalMemory() - runtimeB.freeMemory();
        Long startTimeB = System.nanoTime();
        int[] B_sort = bubble_sort(arr, n);
        Long endTimeB = System.nanoTime();
        Long memoryAfterB = runtimeB.totalMemory() - runtimeB.freeMemory();
        Long memoryUsedB = memoryAfterB - memoryBeforeB;
        // ----
        // Selection ----
        Runtime runtimeS = Runtime.getRuntime();
        runtimeS.gc();
        Long memoryBeforeS = runtimeS.totalMemory() - runtimeS.freeMemory();
        Long startTimeS = System.nanoTime();
        int[] S_sort = selection_sort(arr1, n);
        Long endTimeS = System.nanoTime();
        Long memoryAfterS = runtimeS.totalMemory() - runtimeS.freeMemory();
        Long memoryUsedS = memoryAfterS - memoryBeforeS;
        // ----
        // Insertion ----
        Runtime runtimeI = Runtime.getRuntime();
        runtimeI.gc();
        Long memoryBeforeI = runtimeI.totalMemory() - runtimeI.freeMemory();
        Long startTimeI = System.nanoTime();
        int[] I_sort = insertion_sort(arr2, n);
        Long endTimeI = System.nanoTime();
        Long memoryAfterI = runtimeI.totalMemory() - runtimeI.freeMemory();
        Long memoryUsedI = memoryAfterI - memoryBeforeI;
        // ----
        System.out.println("------------------------------------------");
        System.out.println("Bubble_Sort    : " + Arrays.toString(B_sort));
        System.out.println("Bubble Sort Time: " + (endTimeB - startTimeB) + " ns");
        System.out.println("Bubble Sort Memory Used: " + memoryUsedB + " bytes");
        System.out.println("Bubble Sort Memory Used: " + (memoryUsedB / 1024) + " kb");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("Selection_Sort    : " + Arrays.toString(S_sort));
        System.out.println("Selection Sort Time: " + (endTimeS - startTimeS) + " ns");
        System.out.println("Selection Sort Memory Used: " + memoryUsedS + " bytes");
        System.out.println("Selection Sort Memory Used: " + (memoryUsedS / 1024) + " kb");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("Insertion_Sort    : " + Arrays.toString(I_sort));
        System.out.println("Insertion Sort Time: " + (endTimeI - startTimeI) + " ns");
        System.out.println("Insertion Sort Memory Used: " + memoryUsedI + " bytes");
        System.out.println("Insertion Sort Memory Used: " + (memoryUsedI / 1024) + " kb");
        System.out.println("------------------------------------------");
    }
}