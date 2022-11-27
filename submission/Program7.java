package submission;

public class Program7 {
    public static void main (String[] args){

        int num;
        for (num = 1; num < 1000; num++) {
            int a = num / 100;
            int b = num / 10 % 10;
            int c = num % 10;
            if (num >= 100 && num <= 1000) {
                if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == num) {
                    System.out.println(num);
                }
            }
            if (num >= 10 && num <= 100) {
                if (Math.pow(b, 2) + Math.pow(c, 2) == num) {
                    System.out.println(num);
                }
            }
            if (num <= 10) {
                if (Math.pow(c, 1) == num) {
                    System.out.println(num);
                }
            }
        }
    }
}