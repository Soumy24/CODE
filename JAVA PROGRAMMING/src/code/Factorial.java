//Find Factorial of a number
package code;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int n,i,Fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value:");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            Fact=Fact*i;
            System.out.println("n Factorial is:"+Fact);
        }
    }
}
