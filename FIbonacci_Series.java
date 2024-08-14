import java.util.Scanner;

public class FIbonacci_Series {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms to be printed ");
        int n= sc.nextInt();
        int count=1;
        int a=0;
        int b=1;
        while(count<=n){
            System.out.println(a);
            int temp=a+b;
            a=b;
            b=temp;
            count++;
        }


    }
}
