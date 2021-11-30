import java.util.Scanner;

public class iConditional {
    public static void main(String[] args) {
        boolean isSunUp=true;

        if(isSunUp){
            System.out.println("Day");
        }
        else{
            System.out.println("Night");
        }

        int age =30;
        if(age>18)
            System.out.println("Can vote");
        else
            System.out.println("Cant vote");

        // Logical operators (&& (both true) , || (either of them is true) , !(NOT))

        int a=60;
        int b=40;
        int c=60;
        System.out.println(a<50 && b<50);
        System.out.println(a<50 || b<50);

        System.out.println(!(c==a));

        // SWITCH Statement

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 : 
                System.out.println("Monday");
                break;
            case 2 : 
                System.out.println("Tuesday");
                break;
            case 3 : 
                System.out.println("Wednesday");
                break;
            case 4 : 
                System.out.println("Thrusday");
                break;
            case 5 : 
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday to sunday");

            
        }


    }
    
}
