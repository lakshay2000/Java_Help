// inheritance - Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 

// Java does not support Multiple Inheritance 

// Inheritance are of 4 types - 
// Single Level CLass 
// Multi Level Inheritance 
// Hierarchial Inheritance
// Hybrid Inhertiance 
class Shape{
    // Base Class 
    String color;
    public void area(){
        System.out.println("Displays area");
    }

}

class Triangle extends Shape{
    // Derived Class 
    public void area(int l,int h){
        System.out.println(0.5*(l*h));
    }
}

class EquilateralTriangle extends Triangle{
    // Multilevel Inheritance 
    public void area(int l,int h){
        System.out.println(0.5*(l*h));
    }

}

class Circle extends Shape{
    // Hierarchial Inhertiance 
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class rInheritance {
    public static void main(String[] args) {
        EquilateralTriangle e1=new EquilateralTriangle();
        e1.area(6, 6);
        Triangle t1=new Triangle();
        t1.area(6, 6);

        Circle c1=new Circle();
        c1.area(5);
        // t1.color="red";
    }
    
}
