//write a program to count number of even and odd digits in a number
package code;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number:");
        String number = s.nextLine();
        int evenCount=0;
        int oddCount=0;
        for(char digit : number.toCharArray()){
            if(Character.isDigit(digit)){
                int num = Character.getNumericValue(digit);
                if(num%2==0){
                    evenCount++;

                }
                else{
                    oddCount++;

                }
            }
        }
        System.out.println("Even digits:"+evenCount);
        System.out.println("Odd digits:"+oddCount);

    }
}