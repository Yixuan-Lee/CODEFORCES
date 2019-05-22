package A;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_maths_339A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine();
        if (formula.contains("+")) {
            String[] str_nums = formula.split("\\+");
//            System.out.println(Arrays.toString(str_nums));
            int[] nums = new int[str_nums.length];
            int i = 0;
            for (String str_num : str_nums) {
                nums[i++] = Integer.valueOf(str_num);
            }
            Arrays.sort(nums);
//            System.out.println(Arrays.toString(nums));

            i = 0;
            StringBuilder Xenia = new StringBuilder();
            for (   ; i < nums.length - 1; i++) {
                Xenia.append(nums[i]).append("+");
            }
            Xenia.append(nums[i]);

            System.out.println(Xenia.toString());

        } else {
            System.out.println(formula);
        }
    }

}
