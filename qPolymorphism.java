// Polymorphism - Polymorphism is the ability to present the same interface for differing underlying forms (data types)

// Two types of POlymorphism - 
// 1) Function Overloading(Compile-time polymorphism)
// 2) Function Overriding (Run-time polymorphism) (inheritance)

class Student{
    // This is called function overloading 
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}


public class qPolymorphism {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.name="Aman";
        s1.age=24;
        System.out.println(((Object) s1.name).getClass().getName());
        System.out.println(((Object) s1.age).getClass().getName());
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name+" "+s1.age);
        s1.printInfo(s1.age+" "+s1.name);

    }
}
