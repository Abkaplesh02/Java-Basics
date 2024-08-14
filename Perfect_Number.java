import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number whom you need factors");
            int a=sc.nextInt();
            int Sum=0;
            System.out.println("The factors are ");
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    Sum+=i;
                    System.out.println(i);
                }
            }
            if((a*2)==Sum){
                System.out.println("This is perfect number ");
            }
            else {
                System.out.println("This is not a perfect number");
            }
        }
}
