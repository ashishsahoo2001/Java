import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the 1st number:");
                int a=sc.nextInt();
        System.out.println("enter the 2nd number:");
        int b =sc.nextInt();

        System.out.println("before swaping a=" + a + " b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping a=" + a + " b="+b);
    }
}
