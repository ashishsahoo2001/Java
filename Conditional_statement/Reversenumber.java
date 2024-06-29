package Conditional_statement;
import java.util.*;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int rem;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
