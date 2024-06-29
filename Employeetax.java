import java.util.Scanner;

    public class Employeetax{
        int pan;
        String name;
        double taxincome;
        double tax;
        public void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name:");
            name=sc.nextLine();
            System.out.println("enter the pan number");
            pan=sc.nextInt();



            System.out.println("enter taxable income");
            taxincome=sc.nextInt();

        }
        public void calculate()
        {
            if(taxincome<=250000){
                tax=0;
            }
            else if(taxincome<=500000){
                tax=.1*(taxincome-250000);
            }
            else if(taxincome<=1000000){
                tax=3000+.2*(taxincome-500000);
            }
            else{
                tax=50000+.3*(taxincome-1000000);
            }
        }
        public void display()
        {
            System.out.println("Pan number:"+pan);
            System.out.println("Name:"+name);
            System.out.println("Taxable income:"+taxincome);
            System.out.println("tax:"+tax);
        }
        public static void main(String[] args){
            Employeetax emp=new Employeetax();
            emp.input();
            emp.calculate();
            emp.display();
        }

    }

