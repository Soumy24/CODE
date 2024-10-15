//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
//6 5 4 3 2 1 2 3 4 5 6
package code;

public class PalindromeTriangle {

    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
