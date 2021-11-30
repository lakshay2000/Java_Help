class Student{
    String name;
    static String school;
    // We used static keyword as we want to keep the name of all the school defined under school class same
    // We can directly cal static class or variable by thier class name 

}


public class uStatic {
    public static void main(String[] args) {
        Student.school="JNV";
        Student s1=new Student();
        s1.name="tony";
        System.out.println(s1.name);
        System.out.println(s1.school);
        s1.school="BBPS";
        System.out.println(s1.school);
        // if we change the static variable value then it will change for every of its object 

    }
    
}
