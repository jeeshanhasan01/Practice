import java.util.Scanner;
class Check_Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Your Number Here");
        int n= sc.nextInt();
        int count=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
        
    }
}
