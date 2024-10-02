import java.util.Scanner;

// Check if number is prime

public class Print_Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which you want to print prime numbers:: ");
        int a= sc.nextInt();
        if(a==1 || a==0){
            return;
        }

        for(int i=2;i<=a;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }

        }
    }
}
