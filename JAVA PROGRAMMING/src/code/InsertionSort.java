//Write a program to sort element in array Using Insertion Sort
package code;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(array);
        System.out.println("Sorted array:");
        printArray(array);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}