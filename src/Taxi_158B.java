import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taxi_158B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_n = sc.nextLine();
        int n = Integer.valueOf(str_n);
        String str_friends = sc.nextLine();
        String[] temp = str_friends.split(" ");
        final int maxCapacity = 4;
        /*
          key: number of friends in 1 group (1/2/3/4)
          value: number of groups with the friend number
         */
        Map<Integer, Integer> friends = new HashMap<>();
        for (int i = 1; i <= maxCapacity; i++) {
            friends.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            friends.put(Integer.valueOf(temp[i]),
                    friends.get(Integer.valueOf(temp[i])) + 1);
        }

        int taxis = friends.get(maxCapacity);
        friends.put(maxCapacity, 0);
        for (int i = 1; i <= maxCapacity; i++) {
            if (friends.get(i) == 0) {
                friends.remove(i);
            }
        }

        while (!friends.isEmpty()) {
            for (int i = maxCapacity - 1; i > 0; i--) {
                if (friends.containsKey(i)) {
                    boolean match = false;
                    for (int j = maxCapacity - i; j > 0; j--) {
                        if (friends.containsKey(j)) {
                            if (i == j && friends.get(i) < 2) {
                                continue;
                            }
                            match = true;
                            taxis++;
                            friends.put(i, friends.get(i) - 1);
                            friends.put(j, friends.get(j) - 1);

                            if (friends.get(i) == 0) {
                                friends.remove(i);
                            }
                            if (i != j && friends.get(j) == 0) {
                                friends.remove(j);
                            }
                            break;
                        }
                    }
                    if (!match) {
                        taxis++;
                        friends.put(i, friends.get(i) - 1);
                        if (friends.get(i) == 0) {
                            friends.remove(i);
                        }
                    }
                }
            }
        }

        System.out.println(taxis);
    }

}
