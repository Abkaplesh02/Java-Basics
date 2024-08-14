import java.util.Scanner;

public class GCD {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b :: ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        while(a>0 && b>0){
            if(a%b==0){
                System.out.println("The GCD of a and b is :: " + b);
                return;
            }
             int temp=a%b;
            a=b;
            b=temp;
        }

        System.out.println("The GCD of a and b is :: " + 1);
    }
}

