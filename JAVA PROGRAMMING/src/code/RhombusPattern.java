//     ******
//    ******
//   ******
//  ******
// ******
//******
package code;

public class RhombusPattern {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
}
}
}
