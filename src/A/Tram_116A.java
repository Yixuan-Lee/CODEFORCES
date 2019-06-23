package A;

import java.util.Scanner;

public class Tram_116A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_stops = sc.nextLine();
        int stops = Integer.valueOf(str_stops);
        int[][] inOut = new int[stops][2];
        for (int i = 0; i < stops; i++) {
            String str_inOut = sc.nextLine();
            String[] temp = str_inOut.split(" ");
            inOut[i][0] = Integer.valueOf(temp[0]);
            inOut[i][1] = Integer.valueOf(temp[1]);
        }

        int maximum = 0;
        int current = 0;
        for (int i = 0; i < stops; i++) {
            current -= inOut[i][0];
            current += inOut[i][1];
            if (current > maximum) {
                maximum = current;
            }
        }

        System.out.println(maximum);
    }

}
