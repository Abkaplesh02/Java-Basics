import java.util.*;
public class Check_even_or_Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for even or odd :: ");
        int n= sc.nextInt();

        if(n%2==0){
            System.out.println("The number is even ");
        }
        else {
            System.out.print("The number is odd");
        }
    }
}
