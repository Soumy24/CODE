//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
package code;

public class NumberIncreasingReversePyramid {

    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
}
}