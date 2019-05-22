import java.util.Scanner;

public class Next_round_158A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int next_round = 0;
        for (int i : scores) {
            if (i >= scores[k - 1] && i > 0) {
                next_round++;
            }
        }
        System.out.println(next_round);
    }

}
