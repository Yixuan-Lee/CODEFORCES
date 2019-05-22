package A;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Football_96A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String players = sc.nextLine();
        int ones = 0;
        int zeroes = 0;

//        try {
//            Field field = String.class.getDeclaredField("value");
//            field.setAccessible(true);
//            char[] chars = (char[]) field.get(players);

            char[] chars = players.toCharArray();
            int temp_0 = 0;
            int temp_1 = 0;
            for (char aChar : chars) {
                if (aChar == '0') {
                    temp_0++;
                    temp_1 = 0;
                    if (temp_0 > zeroes) {
                        zeroes = temp_0;
                    }
                } else {
                    temp_1++;
                    temp_0 = 0;
                    if (temp_1 > ones) {
                        ones = temp_1;
                    }
                }
            }
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }

        if (ones >= 7 || zeroes >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
