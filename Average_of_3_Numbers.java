// Average of 3 numbers

import java.util.Scanner;

public class Average_of_3_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :: ");
        int a=sc.nextInt();
        System.out.println("Enter second number :: ");
        int b=sc.nextInt();
        System.out.println("Enter third number :: ");
        int c= sc.nextInt();

        int average=(a+b+c)/3;
        System.out.println("The average of 3 numbers is ::: " + average);
    }
}
