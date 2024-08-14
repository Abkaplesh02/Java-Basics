import java.util.Scanner;

public class Print_Even_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till which you want to print numbers ::: " );
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println(i);
            i++;
        }
    }
}
