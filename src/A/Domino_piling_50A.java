package A;

import java.util.Scanner;

public class Domino_piling_50A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[][] board = new boolean[M][N];
        int domino = 0;

        // first, scan from left to right, from top to bottom
        domino += M * (N / 2);

        // second, scan from top to bottom, from left to right
        if (N % 2 == 1) {
            domino += M / 2;
        }

        System.out.println(domino);
    }

}
