import java.util.Scanner;

public class Theatre_Square_1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();

        System.out.println((long) (Math.ceil(n * 1.0 / a) * Math.ceil(m * 1.0 / a)));
    }

}
