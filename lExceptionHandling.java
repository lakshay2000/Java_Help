public class lExceptionHandling {
    public static void main(String[] args) {
        // Try-catch in exception handling 
        int[] marks = {97,98,95};
        System.out.println(marks[2]);

        try {

            System.out.println(marks[5]);
        } catch(Exception exception){
            // do things after catching 
            System.out.println("There is no error");
        }



    }
    
}
