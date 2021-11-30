
import java.util.Scanner;


public class hScanner {
    public static void main(String[] args) {
        // Taking input from user 

        // Made an object of Scanner class  
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age");
        int age = sc.nextInt();
        System.out.println(age);
        
        // Taking input as String 
        // next takes only tokens i.e. only 1 word 
        // System.out.println("Enter your name");
        // String name =sc.next();
        // System.out.println(name);
        
        System.out.println("Enter your name: ");
        Scanner cs = new Scanner(System.in);
        // sc.nextLine();
        String name=cs.nextLine();

        System.out.println(name);
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("What is the name of the goal the task is  under?: ");
    //     String goalName = scanner.nextLine();
    //     System.out.println("You entered: ");
    //     System.out.print(goalName);
        sc.close();
        // cs.close();
    }
}
