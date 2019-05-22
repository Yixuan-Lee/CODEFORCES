package A;

import java.util.Scanner;

public class Way_too_long_words_71A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_n = sc.nextLine();
        int n = Integer.valueOf(str_n);
        String[] strings = new String[n];
        int i = 0;
        while (n > 0) {
            strings[i++] = sc.nextLine();
            n--;
        }

        for (String s : strings) {
            if (s.length() > 10) {
                System.out.println(s.charAt(0)
                        + String.valueOf(s.length() - 2)
                        + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }

}
