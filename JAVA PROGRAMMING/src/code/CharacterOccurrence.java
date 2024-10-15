//write a program to count the occurence of a character in a string
package code;

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "Follow Code Yatra";
        char targetChar = 'a';

        int count = countCharacterOccurrences(str, targetChar);
        System.out.println(targetChar + " occurred " + count + " times.");
    }

    public static int countCharacterOccurrences(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
}
}