import java.util.Scanner;

public class Print_Factors_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whom you need factors");
        int a=sc.nextInt();
        System.out.println("The factors are ");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}
