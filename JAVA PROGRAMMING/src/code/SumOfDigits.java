//Find Sum of digits in a number
package code;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number =s.nextInt();
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;

        }
        System.out.println("Sum of digits:"+sum);
    }
}
