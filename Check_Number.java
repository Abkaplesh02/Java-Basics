import java.util.Scanner;

public class Check_Number {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to proceed ::  ");
        int a= sc.nextInt();

        if(a>0){
            System.out.println("1");
        }
        else if(a<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
}
