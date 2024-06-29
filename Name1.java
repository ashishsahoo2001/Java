import java.util.Scanner;
public class Name1 {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the times ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name=sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println(name);
        }
    }
}
