package submission;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int num = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int fibo = 0;
        boolean bool=true;
        for (int i = 0; i < num; i++) {
           fibo=n2+fibo;
           n1=n2;
           n2=n1+n2;
            if (fibo == num) {
                System.out.println(num + " fibonaci number");
                bool=false;
            }
        }
        if(bool){
            System.out.println(num + " is no fibonaci number");
        }

    }
}