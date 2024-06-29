package ops;

public class Demo {
    int a; String name;
    Demo(int i,String n){
a=i;
name=n;
    }
    void show(){
        System.out.println(a +" "+name);
    }

    public static void main(String[] args) {
        Demo r=new Demo(50,"ashish");
        Demo f=new Demo(60, "jitu");
        r.show();
        f.show();
    }
}
