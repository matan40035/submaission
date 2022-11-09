import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("choose number :");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num > 0) {
            for (int x = num - 1; x > 1; x--) {
                if (num % x == 0) {
                    System.out.println("no prime number ");
                }


            }
        num --;}
    }
}


