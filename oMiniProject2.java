import java.util.Scanner;
public class oMiniProject2 {
    public static void main(String[] args) {
        float number_1 , number_2;
        System.out.println("Enter first Number");
        Scanner sc = new Scanner(System.in);
        number_1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        
        number_2 = sc.nextFloat();

        

        System.out.println(number_1);
        System.out.println(number_2);

        String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, 3 for division ";
        System.out.println(prompt);

        

        int input = sc.nextInt();
        
        switch (input){
            case 0: 
                System.out.println("Adding these numbers");
                System.out.print("The Result is : ");
                System.out.println(number_1+number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The Result is : ");
                System.out.println(number_1-number_2);
                break;

            case 2: 
                System.out.println("Multiplicating these numbers");
                System.out.print("The Result is : ");
                System.out.println(number_1*number_2);
                break;
            case 3: 
                System.out.println("Dividing these numbers");
                System.out.print("The Result is : ");
                System.out.println(number_1/number_2);
                break;
            default:
                System.out.println("Invalid Input");

        }
        sc.close();

        



    }

    
}
