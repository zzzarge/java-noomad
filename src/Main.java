//1170)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        for (int i = 0; i < N; i++) {
//            double j = scanner.nextDouble();
//            int days = 0;
//
//            while (j > 1) {
//                j /= 2;
//                days++;
//            }
//
//            System.out.println(days + " dias");
//        }
//    }
//}
//1193)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        scanner.nextLine();
//
//        for (int i = 1; i <= N; i++) {
//            String[] input = scanner.nextLine().split(" ");
//            String number = input[0];
//            String format = input[1];
//
//            System.out.println("Case " + i + ":");
//
//            switch (format) {
//                case "bin" -> {
//                    int decimalValue = Integer.parseInt(number, 2);
//                    System.out.println(decimalValue + " dec");
//                    System.out.println(Integer.toHexString(decimalValue) + " hex");
//                }
//                case "dec" -> {
//                    int decimalValue = Integer.parseInt(number);
//                    System.out.println(Integer.toHexString(decimalValue) + " hex");
//                    System.out.println(Integer.toBinaryString(decimalValue) + " bin");
//                }
//                case "hex" -> {
//                    int decimalValue = Integer.parseInt(number, 16);
//                    System.out.println(decimalValue + " dec");
//                    System.out.println(Integer.toBinaryString(decimalValue) + " bin");
//                }
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}
//1138)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            int A = scanner.nextInt();
//            int B = scanner.nextInt();
//
//            if (A == 0 && B == 0) {
//                break;
//            }
//
//            int[] digitCount = new int[10];
//
//            for (int i = A; i <= B; i++) {
//                String number = Integer.toString(i);
//
//                for (char digit : number.toCharArray()) {
//                    digitCount[digit - '0']++;
//                }
//            }
//
//            for (int i = 0; i < 10; i++) {
//                System.out.print(digitCount[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//1253
//public class Main {
//
//    public static String caesarDecipher(String text, int shift) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            char shiftedChar = (char) (ch - shift);
//            if (shiftedChar < 'A') {
//                shiftedChar += 26;
//            }
//            result.append(shiftedChar);
//        }
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        scanner.nextLine();
//
//        for (int i = 0; i < N; i++) {
//            String codifiedText = scanner.nextLine();
//            int shift = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println(caesarDecipher(codifiedText, shift));
//        }
//    }
//}
//1237
//public class Main {
//
//    public static int findLongestCommonSubstring(String str1, String str2) {
//        int maxLength = 0;
//
//        int len1 = str1.length();
//        int len2 = str2.length();
//
//        int[][] dp = new int[len1 + 1][len2 + 1];
//
//        for (int i = 1; i <= len1; i++) {
//            for (int j = 1; j <= len2; j++) {
//                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    maxLength = Math.max(maxLength, dp[i][j]);
//                } else {
//                    dp[i][j] = 0;
//                }
//            }
//        }
//
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNextLine()) {
//            String str1 = scanner.nextLine();
//            String str2 = scanner.nextLine();
//
//            System.out.println(findLongestCommonSubstring(str1, str2));
//        }
//    }
//}

//1120
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String D = scanner.next();
//            String N = scanner.next();
//
//            if (D.equals("0") && N.equals("0")) {
//                break;
//            }
//
//            String result = N.replace(D, "");
//
//            if (result.isEmpty()) {
//                System.out.println(0);
//            } else {
//                System.out.println(result.replaceFirst("^0+(?!$)", ""));
//            }
//        }
//    }
//}
