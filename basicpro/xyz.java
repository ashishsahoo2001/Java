package basicpro;

public class xyz {

    public static void main(String[] args) {
        int x=1234;
        int rem,sum=0;
        while(x>0) {
            rem = x % 10;
            sum = sum + rem;
            x = x / 10;
        }
            System.out.println(sum);

    }
}
