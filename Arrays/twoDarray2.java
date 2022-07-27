// QUESTION - Take a matrix as input, search for X and print the indices a twhich it occurs ---

package Arrays;

import java.util.Scanner;

public class twoDarray2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scn.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Number found at : (" + i + ", " + j + ")");

                }
            }
        }

    }

}
