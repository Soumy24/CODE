//write a program to find the duplicate number in array
package code;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {3,4,5,6,6}; // Example array

        System.out.println("Duplicate numbers in the array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])


                    System.out.println(a[i]);
            }
        }
    }
}
