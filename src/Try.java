public class Try {
    public static void main(String[] args) {
        System.out.println("stats");
        int num1=10,num2=20;
        CheckNumber(num1,num2);
        System.out.println();
        System.out.println("end");
    }
    public static void CheckNumber(int num1 , int num2){
        if(num1 > num2){
        System.out.println(num1+ " is bigger");

        }
else{
    System.out.println(num2 +"is bigger");
        }
        }
    }
