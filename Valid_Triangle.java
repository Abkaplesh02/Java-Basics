import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            System.out.println();
        }
    }
}
