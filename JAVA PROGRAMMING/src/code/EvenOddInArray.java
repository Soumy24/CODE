//write a program to print even and odd numbers in array
package code;

public class EvenOddInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        System.out.println("Even numbers in the array:");
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers in the array:");
        for (int num : a) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
