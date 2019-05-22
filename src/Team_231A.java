import java.util.Scanner;

public class Team_231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][3];
        int solved = 0;
        for (int i = 0; i < matrix.length; i++) {
            int ones = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    ones++;
                }
            }
            if (ones >= 2) {
                solved++;
            }
        }

        System.out.println(solved);
    }

}
