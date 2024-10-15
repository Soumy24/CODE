//write a program to find the max and min element in array
package code;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] array = {3,4,5,6}; // Example array

        // Initialize max and min with the first element
        int max = array[0];
        int min = array[0];

        // Traverse the array to find max and min
        for (int num : array) {
            if (num > max) {
                max = num; // Update max
            }
            if (num < min) {
                min = num; // Update min
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
}
}