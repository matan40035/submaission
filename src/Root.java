import java.util.Scanner;
public class Root {
        public static void main(String[] args) {
            double A;
            double B;
            double C;
            double X1;
            double X2;
            Scanner scanner =new Scanner(System.in);
            System.out.println("enter a:");
            A=scanner.nextDouble();
            System.out.println("enter b :");
            B=scanner.nextDouble();
            System.out.println("enter c :");
            C=scanner.nextDouble();
            System.out.println("A="+A+" B="+B+" C="+C);
            if (B*B-4*A*C<0) {
                System.out.println("Error");
            }
            else {
                X1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
                X2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
                if (X1==X2){
                    System.out.println("one solution X= "+X1);
                }
                else
                    System.out.println("X1= "+X1+"X2= "+X2);

            }
        }
    }
