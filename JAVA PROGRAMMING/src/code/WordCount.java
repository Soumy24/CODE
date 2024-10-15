//Write a progrm to count words in a string
package code;

public class WordCount {
    public static void main(String[] args) {
        String str = "Follow Code Yatra";

        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Check if the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces
        String[] words = str.split("\\s+");
        return words.length;
}

}
