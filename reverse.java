import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int rem,sum=0;
        while(a>0){
            rem=a%10;
           sum=sum*10+rem;
           a=a/10;
        }
        System.out.println("Reverse of number is "+sum);
    }
}
