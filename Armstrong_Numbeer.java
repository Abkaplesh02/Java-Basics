// Armstrong number
import java.util.Scanner;

public class Armstrong_Numbeer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong number :: ");
        int a=sc.nextInt();
        int b=a;
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=(digit*digit*digit)+sum;
            a=a/10;
        }
        if(sum==b){
            System.out.println("The number is armstrong number :: ");
        }
        else{
            System.out.println("The number is not armstrong number :: ");
        }
    }
}
