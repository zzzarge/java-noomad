import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bc1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine();
            Set<Character> uniqueLetters = new HashSet<>();

            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueLetters.add(c);
                }
            }

            int uniqueCount = uniqueLetters.size();
            if (uniqueCount == 26) {
                System.out.println("frase completa");
            } else if (uniqueCount >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

    }
}
