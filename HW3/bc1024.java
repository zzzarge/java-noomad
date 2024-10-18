import java.util.Scanner;

public class bc1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            StringBuilder shifted = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    shifted.append((char) (c + 3));
                } else {
                    shifted.append(c);
                }
            }

            shifted.reverse();

            int length = shifted.length();
            for (int j = length / 2; j < length; j++) {
                shifted.setCharAt(j, (char) (shifted.charAt(j) - 1));
            }

            System.out.println(shifted.toString());
        }

    }
}
