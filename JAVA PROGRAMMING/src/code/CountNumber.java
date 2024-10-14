//Count number of digits in a Number
package code;

public class CountNumber {
    public static void main(String args[]){
        int n=1234;
        int i,count=0;
        for(i=n;i>0;i=i/10){
            count++;

        }
        System.out.println(count);

    }
}
