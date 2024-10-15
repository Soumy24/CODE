//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6 ;
package code;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        int rows = 6; // You can change this value for more rows

        for (int i = 1; i <= rows; i++) {
            // Printing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}


