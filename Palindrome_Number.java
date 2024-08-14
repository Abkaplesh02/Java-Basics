import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome number ");
        int a=sc.nextInt();
        int b=a;
        int Rev=0;
        while(a>0){
            int digit=a%10;
            Rev=Rev*10+digit;
            a=a/10;
        }
        if(b==Rev){
            System.out.println("This is a palindrome number ");
        }
        else{
            System.out.println("This is not a palindrome number ");
        }

    }
}
