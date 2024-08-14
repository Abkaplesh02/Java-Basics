import java.util.Scanner;

public class Member_of_Fibonacci_or_Not {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check :: ");
        int n=sc.nextInt();
        int count=1;
        int a=0;
        int b=1;
        while(a<n){
            int temp=a+b;
            a=b;
            b=temp;
            count++;
        }
        if(a==n){
            System.out.println("Member of fibonacci series " + count);
        }
        else{
            System.out.println("Not a member of fibonacci series");
        }
    }
}
