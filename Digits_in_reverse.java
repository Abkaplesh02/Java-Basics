import java.util.Scanner;

public class Digits_in_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse digits");
        int a=sc.nextInt();
        int mult=10;
        int newN=0;
        while(a>0){
            int digit=a%10;
            newN=newN*10+digit;
            a=a/10;
        }
        System.out.println("The reverse of number is :: " + newN);
    }
}
