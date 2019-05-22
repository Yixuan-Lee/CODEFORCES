import java.util.Scanner;

public class String_task_118A {

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u' || ch == 'y'
                || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U' || ch == 'Y';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // deletes all the vowels
        StringBuilder temp1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                temp1.append(str.charAt(i));
            }
        }

        // inserts a character '.'
        StringBuilder temp2 = new StringBuilder();
        for (int i = 0; i < temp1.toString().length(); i++) {
            temp2.append('.');
            temp2.append(temp1.charAt(i));
        }

        // uppercase -> lowercase
        StringBuilder temp3 = new StringBuilder();
        for (int i = 0; i < temp2.toString().length(); i++) {
            if (Character.isUpperCase(temp2.charAt(i))) {
                temp3.append(Character.toLowerCase(temp2.charAt(i)));
            } else {
                temp3.append(temp2.charAt(i));
            }
        }

        System.out.println(temp3.toString());
    }

}
