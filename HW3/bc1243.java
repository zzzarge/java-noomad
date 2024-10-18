import java.util.Scanner;

public class bc1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String statement = sc.nextLine();
            String[] symbols = statement.split(" ");
            int totalLength = 0;
            int wordCount = 0;

            for (String symbol : symbols) {
                if (isWord(symbol)) {
                    String cleanWord = symbol.endsWith(".") ? symbol.substring(0, symbol.length() - 1) : symbol;
                    totalLength += cleanWord.length();
                    wordCount++;
                }
            }

            int averageLength = wordCount == 0 ? 0 : totalLength / wordCount;

            if (averageLength <= 3) {
                System.out.println(250);
            } else if (averageLength <= 5) {
                System.out.println(500);
            } else {
                System.out.println(1000);
            }
        }

    }

    private static boolean isWord(String symbol) {
        if (symbol.endsWith(".")) {
            symbol = symbol.substring(0, symbol.length() - 1);
        }

        for (char c : symbol.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return !symbol.isEmpty();
    }
}
