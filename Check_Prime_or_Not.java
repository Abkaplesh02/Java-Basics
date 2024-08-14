import java.util.Scanner;

public class Check_Prime_or_Not {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for prime :: ");
        int a=sc.nextInt();
        if(a==1 || a==0){
            System.out.println("The number is not prime " );
            return;
        }
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                System.out.println("The number is not a prime number ");
                return;
            }

        }
        System.out.println("The number is prime number ");
    }
}
