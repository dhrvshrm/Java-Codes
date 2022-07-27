package Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        // System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        String name = sc.next();

        for (int i = 0; i < names.length; i++) {
            if (names[i] == name) {
                System.out.println("s found at : " + i);
            }

        }
    }
}
