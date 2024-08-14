import java.util.*;
public class FInd_SI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal value :: ");
        int Prinicipal=sc.nextInt();
        System.out.println("Ente Rate value :: ");
        int Rate=sc.nextInt();
        System.out.println("Enter Time :: ");
        int Time=sc.nextInt();

        int SI= (Prinicipal*Rate*Time)/100;

        System.out.println("The SI is :::  " + SI );
    }
}
