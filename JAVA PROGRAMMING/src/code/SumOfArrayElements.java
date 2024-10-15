//Find the largest number in array
package code;
import java.util.stream.IntStream;

public class SumOfArrayElements {
    public static void main(String args[]){
       int[] a = {1,2,3,4};
       int sum = IntStream.of(a).sum();
       System.out.println("The sum is"+sum);
        }
    }

