package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stones_on_the_table_266A {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str_n = sc.nextLine();
        int n = Integer.valueOf(str_n);
        String str_stones = sc.nextLine();

        List<Character> stones = new ArrayList<>();
        int minimum = 0;
        for (int i = 0; i < str_stones.length(); i++) {
            stones.add(str_stones.charAt(i));
        }

        for (int i = 0; i < stones.size() - 1; i++) {
            if (stones.get(i) == stones.get(i + 1)) {
                stones.remove(i + 1);
                minimum++;
                i--;
            }
        }

        System.out.println(minimum);
    }

}
