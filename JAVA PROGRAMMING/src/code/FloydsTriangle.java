//1
//2 3
//4 5 6
package code;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 3, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}