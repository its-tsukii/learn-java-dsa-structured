package Algorithms.Sorting.Efficient;

import java.util.Arrays;

class MergeSort_QuickSort {

    static int[] merge_sort(int[] arr, int n) {

        return arr;
    }

    static int[] quick_sort(int[] arr, int n) {

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int n = arr.length;
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        System.out.println("------------------------------------------");
        // Merge ----
        Runtime runtimeM = Runtime.getRuntime();
        runtimeM.gc();
        Long memoryBeforeM = runtimeM.totalMemory() - runtimeM.freeMemory();
        Long startTimeM = System.nanoTime();
        int[] M_sort = merge_sort(arr1, n);
        Long endTimeM = System.nanoTime();
        Long memoryAfterM = runtimeM.totalMemory() - runtimeM.freeMemory();
        Long memoryUsedM = memoryAfterM - memoryBeforeM;
        // ----
        // Quick ----
        Runtime runtimeQ = Runtime.getRuntime();
        runtimeQ.gc();
        Long memoryBeforeQ = runtimeQ.totalMemory() - runtimeQ.freeMemory();
        Long startTimeQ = System.nanoTime();
        int[] Q_sort = quick_sort(arr2, n);
        Long endTimeQ = System.nanoTime();
        Long memoryAfterQ = runtimeQ.totalMemory() - runtimeQ.freeMemory();
        Long memoryUsedQ = memoryAfterQ - memoryBeforeQ;
        // ----
        System.out.println("------------------------------------------");
        System.out.println("Merge_Sort    : " + Arrays.toString(M_sort));
        System.out.println("Merge Sort Time: " + (endTimeM - startTimeM) + " ns");
        System.out.println("Merge Sort Memory Used: " + memoryUsedM + " bytes");
        System.out.println("Merge Sort Memory Used: " + (memoryUsedM / 1024) + " kb");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("Quick_Sort    : " + Arrays.toString(Q_sort));
        System.out.println("Quick Sort Time: " + (endTimeQ - startTimeQ) + " ns");
        System.out.println("Quick Sort Memory Used: " + memoryUsedQ + " bytes");
        System.out.println("Quick Sort Memory Used: " + (memoryUsedQ / 1024) + " kb");
        System.out.println("------------------------------------------");
    }
}