import java.util.Scanner;
class Fibo_Number {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Your Input Number");
       int n= sc.nextInt();
       int a=0;
       int b=1;
       for(int i=1; i<=n; i++){
       //  System.out.println(a); to show series
           int c=a+b;
           a=b;
           b=c;
       }
       System.out.println(a);
       
    }
}
