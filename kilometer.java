
import java.util.Scanner;

public class kilometer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the kilometer");
        int kilometer=sc.nextInt();
        int meter=kilometer*1000;
        System.out.println(kilometer+" kilometer is equal to "+meter+" meter");
    }
}
