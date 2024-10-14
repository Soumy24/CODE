//Reverse String
package code;

public class Reverse {
    public static void main(String args[]){
        String source="ABCD";
        for(String part:source.split(" ")){
            System.out.println(new StringBuilder(part).reverse().toString());
        }
    }
}
