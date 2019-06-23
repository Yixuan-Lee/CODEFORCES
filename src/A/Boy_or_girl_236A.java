package A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boy_or_girl_236A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Map<Character, Boolean> counter = new HashMap<>();

        int distinct = 0;
        for (int i = 0; i < name.length(); i++) {
            if (!counter.containsKey(name.charAt(i))) {
                distinct++;
                counter.put(name.charAt(i), true);
            }
        }

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }

}
