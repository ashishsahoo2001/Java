package Function;

public class  DecToBin {
//    public static void dectobin(int n){
//        int mydec=n;
//        int pow= 0;
//        int rem,dec=0;
//        while(n>0){
//            rem=n%2;
//            dec=dec+(rem*(int)Math.pow(10,pow));
//            pow++;
//            n=n/2;
//        }
//        System.out.println("The decimal num of "+mydec+" is "+dec);
//    }
//public static void main(String[] args){
//    dectobin(10);
//}

    public static void bintodec(int n){
        int mybin=n;
        int pow=0;
        int rem,bin=0;
        while(n>0){
            rem=n%10;
            bin=bin+(rem*(int)Math.pow(2,pow));
            pow++;
            n=n/10;

        }
        System.out.println("The decimal value of "+mybin+" is = "+bin);
    }
    public static void main(String[] args){
        bintodec(10);
    }
}
