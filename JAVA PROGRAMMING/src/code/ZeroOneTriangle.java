//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
//0 1 0 1 0 1
package code;

public class ZeroOneTriangle {

    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if the sum of row and column indices is even, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
