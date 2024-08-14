import java.util.Scanner;

public class Largest_of_N_Numbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you ");
        int a=sc.nextInt();
        int max=-100;
        int count=1;
        while(count<=a){
            int number=sc.nextInt();
            max=Math.max(number,max);
            count++;
        }
        System.out.println("The largest number of all is :: " + max);
    }
}
