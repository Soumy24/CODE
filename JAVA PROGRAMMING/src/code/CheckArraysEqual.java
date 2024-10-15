//write a program to check 2 arrays are equal or not
package code;
import java.util.Arrays;

public class CheckArraysEqual {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b= {1, 2, 3, 4, 5};

        boolean areEqual = Arrays.equals(a, b);

        if (areEqual) {
            System.out.println("a and b are equal.");
        } else {
 }
}
}