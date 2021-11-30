import java.util.Scanner;

public class nMiniProject {
    public static void main(String[] args) {
        // Mini Project - Guessing the Number
        int myNum = (int)(Math.random()*100);
        int userNum=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Guess my number");
            userNum=sc.nextInt();
            if(userNum==myNum){
                System.out.println("Correct number");
                break;

            }
            else if (userNum>myNum){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }


        }while(userNum>=0);
        System.out.println("My number was "+userNum);


    }

}
