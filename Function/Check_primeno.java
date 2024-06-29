package Function;
//import java.lang.Math;
public class Check_primeno {
    //    public static boolean isPrime(int n){
//for(int i=2;i<=n-1;i++)
//{
//    if(n%i==0)
//    {
//        return false;
//    }
//}
//return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(3));
//    }
    //  ---------------------------------optimized-------------------------------------
    public static boolean isPrime(int n) {
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
    public static void range(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
       // System.out.print(isPrime(11));
        range(100);
    }
}