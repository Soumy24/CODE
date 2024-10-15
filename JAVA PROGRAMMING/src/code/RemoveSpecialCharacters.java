//write a program to remove junk or special character in a string in java simple code
package code;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String input = "!@$5Follow Code Yatra";

        String result = removeSpecialCharacters(input);
        System.out.println("Output: " + result);
    }

    public static String removeSpecialCharacters(String str) {
        // Use regex to replace special characters and numbers with an empty string
        return str.replaceAll("[^a-zA-Z\\s]", "").trim();
}
}