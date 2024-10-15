//A
//A B
//A B C
//A B C D
package code;

public class CharacterTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (char i = 'A'; i < 'A' + n; i++) {
            for (char j = 'A'; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}