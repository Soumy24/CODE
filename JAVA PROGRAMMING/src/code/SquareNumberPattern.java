//1 2 3
//2 4 6
//3 6 9
package code;

public class SquareNumberPattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print((i * j) + " ");
            System.out.println();
        }
    }
}