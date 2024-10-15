//Write a program to count words in a string
package code;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "Follow Code Yatra";

        String result = reverseEachWord(input);
        System.out.println("Reversed words: " + result);
    }

    public static String reverseEachWord(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to the result
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        // Trim the final string to remove extra space at the end
        return reversedString.toString().trim();
}
}