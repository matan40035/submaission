package submission;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int num = scanner.nextInt();
            for(int i = 2; num > 0; i++){
                int count=0;
                for(int x=1;x<=i;x++){
                    if (i%x==0){
                        count ++;
                    }
                }
                if (count<=2) {
                System.out.println(i+" ");
                num--;
                }
            }

    }
}