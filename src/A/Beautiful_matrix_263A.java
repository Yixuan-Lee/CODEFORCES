package A;

import java.util.Scanner;

public class Beautiful_matrix_263A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        int x_1 = 0;
        int y_1 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    x_1 = i;
                    y_1 = j;
                }
            }
        }

        System.out.println(Math.abs((2 - x_1)) + Math.abs((2 - y_1)));
    }

}
