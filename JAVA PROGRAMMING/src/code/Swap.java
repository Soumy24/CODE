//Swap 2 Numbers
package code;

public class Swap {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("a is " + a + " and b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a is " + a + " and b is " + b);
    }
}