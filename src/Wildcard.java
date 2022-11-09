import java.util.Scanner;

public class Wildcard {

        public static void main(String[] args) {
            int num;
            int x;
            int b;
            int num1;
            System.out.println("enter number bigger to 3 and odd :");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            while (num < 3 || num % 2 == 0) {
                System.out.println("enter number bigger to 3 and odd :");
                num = scanner.nextInt();
            }
            b = num + 1;
            num1 =num;
            while (num > 0) {
                for (x = b; x > num; x--) {
                    System.out.print("*");

                }
                System.out.println();
                num = num - 2;
            }

            while (num1 > 0) {
                for (int y = 2; y < num1; y++) {
                    System.out.print("*");

                }
                System.out.println();
                num1 =num1 - 2;

            }

        }
    }