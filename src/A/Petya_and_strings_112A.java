package A;

import java.util.Scanner;

public class Petya_and_strings_112A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int compare = s1.compareTo(s2);
        if (compare > 0) {
            System.out.println(1);
        } else if (compare < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

}
