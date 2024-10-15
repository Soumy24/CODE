//Write a program to find second largest number in array
package code;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 2}; // Example array

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find largest and second largest
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;     // Update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
 }
}
}
