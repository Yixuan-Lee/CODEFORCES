package A;

import java.util.Scanner;

public class Word_capitalization_281A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(Character.toUpperCase(word.charAt(0))
                + word.substring(1));
    }

}
