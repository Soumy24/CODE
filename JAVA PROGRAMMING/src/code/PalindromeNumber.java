//Find whether Number is palindrome or not
package code;
import java.lang.*;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int org_num=a;
        int d;
        int rev=0;
        while(a>0) {
            d = a% 10;
            rev = rev * 10 + d;
            a = a / 10;

        }
        if(rev==org_num){
            System.out.println("This is Palindrome Number");
        }
        else{
            System.out.println("This is not Palindrome NUmber");
        }
    }
}
