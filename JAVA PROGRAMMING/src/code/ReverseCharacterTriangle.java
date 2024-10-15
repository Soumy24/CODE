//C C C
//B B
//A
package code;

public class ReverseCharacterTriangle {
    public static void main(String[] args) {
        int rows = 3;
        for (char i = (char) ('A' + rows - 1); i >= 'A'; i--) {
            for (int j = 0; j <= i - 'A'; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

