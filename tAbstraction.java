// Abstraction - We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details
// Properties of Abstraction  
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.

// This is impure Abstraction 

abstract class Animal{
    
    abstract void walk();
    Animal(){
        System.out.println("you are inside animal");
    }
    public void eat(){
        System.out.println("Animals eat");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}



public class tAbstraction {
    
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
    
}
