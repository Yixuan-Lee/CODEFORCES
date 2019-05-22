package A;

import java.util.Scanner;

public class Bit_plus_plus_282A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_n = sc.nextLine();
        int n = Integer.valueOf(str_n);

        int x = 0;
        while (n > 0) {
            String str = sc.nextLine();
            if (str.contains("+")) {
                x++;
            } else if (str.contains("-")) {
                x--;
            }

            n--;
        }

        System.out.println(x);
    }

}
