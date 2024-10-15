//*
//**
//***
//****
//*****
//******
package code;

public class RightHalfPyramid {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

    }
}
