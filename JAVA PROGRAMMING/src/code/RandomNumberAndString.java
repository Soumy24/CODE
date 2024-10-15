//write a program to generate Random Number and String
package code;
import java.util.Random;

public class RandomNumberAndString {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 0 and 100
        int randomNumber = random.nextInt(101); // 0 to 100
        System.out.println("Random Number: " + randomNumber);

        // Generate a random string of specified length
        int length = 10; // Specify the length of the string
        String randomString = generateRandomString(length);
        System.out.println("Random String: " + randomString);
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();

    }
}