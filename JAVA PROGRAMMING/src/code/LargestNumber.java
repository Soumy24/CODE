//Find the largest Number
package code;

public class LargestNumber {
    public static void main(String args[]){
        int arr[]={10,20,30};
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if (max < arr[i]) {
                max=arr[i];

            }
        }
        System.out.print(max);
    }
}
