package Functionquestion;

public class Ashish {
    int id;
    String name;
    Ashish(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
    }

    public static void main(String[] args) {
        Ashish a=new Ashish(1,"Jitu");
        Ashish b=new Ashish(2,"Kutu");

        a.display();
        b.display();
    }
}
