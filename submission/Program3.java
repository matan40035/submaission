package submission;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int num;
        int x;
        int r;
        int b;
        int s;
        int space1;
        int space2;
        int num1;
        System.out.println("enter number bigger to 3 and odd :");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num < 3 || num % 2 == 0) {
            System.out.println("enter number bigger to 3 and odd :");
            num = scanner.nextInt();
        }
        b = num + 1;
        num1 = num;
        while (num > 0) {
            for (space1 = num / 2; space1 > 0; space1--) {
                System.out.print(" ");
            }
            for (x = b; x > num; x--) {
                System.out.print("*");
            }

            System.out.println();
            num = num - 2;
        }
        s = num1;
        r = num1;
        while (num1 > 0) {
            for (space2 = s; space2 >= r; space2--) {
                System.out.print(" ");

            }
            for (int y = 2; y < num1; y++) {
                System.out.print("*");
            }

            System.out.println();
            r = r - 1;
            num1 = num1 - 2;

        }

    }
}

