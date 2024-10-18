import java.util.Scanner;

public class bc1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            StringBuilder processed = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (c == 'o' || c == 'O') {
                    processed.append('0');
                } else if (c == 'l') {
                    processed.append('1');
                } else if (Character.isDigit(c)) {
                    processed.append(c);
                } else if (c == ',' || c == ' ') {
                    continue;
                } else {
                    processed = new StringBuilder("error");
                    break;
                }
            }

            if (processed.toString().equals("error") || processed.isEmpty()) {
                System.out.println("error");
            } else {
                try {
                    long value = Long.parseLong(processed.toString());

                    if (value > 2147483647) {
                        System.out.println("error");
                    } else {
                        System.out.println(value);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("error");
                }
            }
        }

    }
}
