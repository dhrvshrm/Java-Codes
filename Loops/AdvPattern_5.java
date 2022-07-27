package Loops;

public class AdvPattern_5 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // upper first half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            // upper second half
            for (int j = 2; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
            // System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // lower first half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            // lower second half
            for (int j = 2; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}
