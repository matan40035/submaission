package submission;

import java.util.Scanner;

public class Program2 {
    public static void main (String[]args) {
                int length;
                double difference;
                double start;
                double x;
                System.out.println("choose when start :");
                Scanner scanner = new Scanner(System.in);
                start = scanner.nextDouble();
                System.out.println("choose difference :");
                difference = scanner.nextDouble();
                System.out.println("choose lenght :");
                length = scanner.nextInt();
                System.out.println(start);
                x = start;
                while (length > 0) {
                    x = x + difference;
                    System.out.println(x);
                    length = length - 1;
                }
            }
        }

    