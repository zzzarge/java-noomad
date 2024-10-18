import java.util.Scanner;

public class bc1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            StringBuilder dancingSentence = new StringBuilder();

            boolean upper = true;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (upper) {
                        dancingSentence.append(Character.toUpperCase(c));
                    } else {
                        dancingSentence.append(Character.toLowerCase(c));
                    }
                    upper = !upper;
                } else {
                    dancingSentence.append(c);
                }
            }

            System.out.println(dancingSentence);
        }

    }
}
