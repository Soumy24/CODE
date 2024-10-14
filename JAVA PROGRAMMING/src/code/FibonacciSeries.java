package code;

public class FibonacciSeries {
    public static void main(String args[]){
        int n=10,FirstTerm=0,SecondTerm=1;
        System.out.println("Fibonacci Series till "+n+"terms:");
        for(int i=1;i<=n;i++){
            System.out.println(FirstTerm +" ,");
            int nextTerm = FirstTerm+SecondTerm;
            FirstTerm=SecondTerm;
            SecondTerm = nextTerm;

        }
    }
}
