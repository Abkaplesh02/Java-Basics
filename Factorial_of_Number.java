import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial :: ");
        int a=sc.nextInt();
        if(a<=1){
            System.out.println("The factorial of number is :: " + 1);
        }
        int Fact=1;
        while(a>0){
            Fact*=a;
            a--;
        }
        System.out.println("The factorial is :: " + Fact);
    }
}
