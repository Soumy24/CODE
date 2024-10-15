//write a program to find missing number in array
package code;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        int n = 5; // The expected size of the array (1 to n)

        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        // Calculate the actual sum of the array
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
}
}