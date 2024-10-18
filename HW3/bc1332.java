import java.util.Scanner;

public class bc1332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            if (word.length() == 3) {
                if (matches(word, "one")) {
                    System.out.println(1);
                } else if (matches(word, "two")) {
                    System.out.println(2);
                }
            } else if (word.length() == 5) {
                if (matches(word, "three")) {
                    System.out.println(3);
                }
            }
        }

    }

    private static boolean matches(String word, String target) {
        int differences = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                differences++;
            }
            if (differences > 1) {
                return false;
            }
        }
        return true;
    }
}
