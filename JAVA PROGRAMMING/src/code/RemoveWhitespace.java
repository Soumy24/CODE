//write a program to remove all the white space in a string
package code;

import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all whitespace
        String result = input.replaceAll("\\s+", "");

        System.out.println("String without whitespace: " + result);
}
}
