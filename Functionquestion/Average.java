package Functionquestion;

public class Average {
//    public static int average(){
//        int a=10;
//        int b=20;
//        int c=30;
//        int avg=(a+b+c)/3;
//        return avg;
//
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(average());
//    }
//}
//public class EvenChecker {

    public static void main(String[] args) {
        int numberToCheck = 43; // Change this to any integer you want to check


        boolean result = isEven(numberToCheck);

        if (result) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is not even.");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}

