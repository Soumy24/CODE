//123
//12
//1
package code;

public class ReverseNumberPyramid {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
