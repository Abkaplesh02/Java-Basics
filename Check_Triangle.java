import java.util.Scanner;

public class Check_Triangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangle ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==b && a==c && b==c){
            System.out.println("This is equilateral triangle");
        }
        else if(a==b || a==c || b==c){
            System.out.println("This is isoceles triangle");
        }
        else{
            System.out.println("This is scalene triangle");
        }
    }
}
