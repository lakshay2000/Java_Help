// Pure Abstraction can be done using interfaces in Java. it hides every useless information and shows only useful information to the user
// Interfaces are like clases only but they have some fixed propeties 

// Properties of Interfaces 
// All the fields in interfaces are public, static and final by default.
// All methods are public & abstract by default.
// A class that implements an interface must implement all the methods declared in the interface.
// Interfaces support the functionality of multiple inheritance.

interface Animal{
    void walk();
    int eyes=2;
}



interface Herbivore{
    void walk();
    int eye=4;

}

class Cow implements Herbivore{
    public void walk(){
        System.out.println("Cow");
    }
}


class Horse implements Animal,Herbivore{
    
    public void walk(){
        System.out.println("Horse");
        System.out.println(this.eyes);
    }
}



public class tAbstraction1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Cow cw=new Cow();
        cw.walk();

    }
    
}
