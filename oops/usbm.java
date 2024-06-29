package oops;
class Animal {
    Animal() {
        System.out.println("Anjan"); // Constructor without arguments
    }

    Animal(int p) {
        System.out.println("usbm"); // Constructor with an integer argument (int p)
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Call the no-argument constructor of the superclass Animal by default
        System.out.println("Rohit");
    }

    Dog(int c) {
        super(c); // Call the parameterized constructor of the superclass Animal
        System.out.println("virat");
    }
}

public class usbm { // Class name changed to Main (convention)
    public static void main(String[] args) {
        // Create an Animal object using the no-argument constructor
        Animal animal = new Animal();  // Prints "Anjan"

        // Create a Dog object using the no-argument constructor
       // Dog dog = new Dog();         // Prints "Anjan" (from Animal's no-argument constructor)
        //        Prints "Rohit"

        // Create a Dog object using the parameterized constructor
        Dog dogWithParam = new Dog(5); // Prints "usbm"  (from Animal's parameterized constructor)
        //        Prints "virat"
    }
}



