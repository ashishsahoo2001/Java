package CONTROL_STATEMENT;
import java.util.*;
public class Question_5leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) ||(year%400==0)){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not a leapyear");
        }
    }
}
