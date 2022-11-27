package submission;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int num = scanner.nextInt();
        int sum =0;
        while (num>9){
            sum = sum+num%10;
            num=num/10;
        }
        sum=sum+num;
        System.out.println("the sum of the digits is : "+sum);
    }
}
