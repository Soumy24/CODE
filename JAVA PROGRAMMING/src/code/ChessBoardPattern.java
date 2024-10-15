//* * * *
// * * * *
//* * * *
// * * * *
//* * * *
// * * * *
package code;

public class ChessBoardPattern {
    public static void main(String[] args) {
        int n = 8; // Size of the chessboard

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for black squares and ' ' for white squares
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}