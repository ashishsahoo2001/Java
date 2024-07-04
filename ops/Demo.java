package ops;

/*class A{
    private static int x;
    int y;
    void f1()
    {
        x=10;
        System.out.println("x="+x);
    }
//    void f2()
//    {
//        System.out.println(x);
//    }
    void f3()
    {
        x=12;
        System.out.println(x);
    }

}
class Demo{
    public static void main(String[] args) {
        A a1=new A();

        a1.f1();

        a1.f3();

    }
}*/
class A{
    private int x;
    private static int y;

    void f1()
    {
        x=13;
        y=22;
    }
        void f2()
    {
     System.out.println(x);
    }
   /* void f3()
    {
        x=12;
        System.out.println(x);
    }*/
}
class Demo
{
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1.f1();
        a2.f2();
    }
}