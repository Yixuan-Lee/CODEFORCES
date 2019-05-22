import java.util.Scanner;

public class Watermelon_4A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int watermelon = sc.nextInt();
        if (watermelon == 2) {
            System.out.println("NO");
        } else {
            System.out.println(watermelon % 2 == 0 ? "YES" : "NO");
        }
    }

}
