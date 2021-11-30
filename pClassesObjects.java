class Pen{
    String color;
    String type; //ballpoint; gel

    // function inside a class is called methods 

    public void write(){
        System.out.println("Writing something");
    }

    // this keyword refers to the current object 
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constructor 
    // Non-parametried constuctor 
    Student(){
        System.out.println("Constructor has been made");
    }
    // Paramterized constructor 
    Student(String name,int age){
        this.name=name;
        this.age=age;
        // class object = functon parameter
    }
    // Copy constructor 
    Student(Student s3){
        this.name=s3.name;
        this.age=s3.age;

        // s2.name=this.name;
        // s2.age=this.age;
        // it copies all the information in student s1 in the current objext 
    }
}



public class pClassesObjects{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="black";
        pen1.type="gel";
        pen1.write();
        pen1.printColor();


        Pen pen2=new Pen();
        pen2.color="Blue";
        pen2.type="gel";
        pen2.printColor();

        Student s1=new Student("aman",24);
        Student s2=new Student(s1);
        // s1.name="Aman";
        // s1.age=24;
        // s1.printName();
        s2.printName();
    }
}