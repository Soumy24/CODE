//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
package code;

public class RightAngleTriangleNumbers {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}