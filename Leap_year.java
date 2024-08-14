import java.util.Scanner;

public class Leap_year {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check for leap year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This is leap year ");
                    return;
                }else {
                    System.out.println("This is not a leap year ");
                    return;
                }
            }
            System.out.println("This is a leap year");
            return;
        }
        else{
            System.out.println("This is not a leap year");
            return;
        }

    }
}
