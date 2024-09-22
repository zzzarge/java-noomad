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