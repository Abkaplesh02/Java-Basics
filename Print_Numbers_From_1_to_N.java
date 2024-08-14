import java.util.Scanner;

public class Print_Numbers_From_1_to_N {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print :: ");
         int a=sc.nextInt();
         int sum=0;
         int Product=1;
        for(int i=1;i<=a;i++){
            System.out.println(i);
            sum+=i;
            Product*=i;
        }
        System.out.println("The sum of numbers till N is ::: " + sum);
        System.out.println("The Product of numbers till N is ::: " + Product);
    }
}
