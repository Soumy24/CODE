//* *
//*
//* *
//* * *
//* * * *
//* * * * *
package code;

public class HourglassPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the hourglass
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

