public class kBreakContinue {
    public static void main(String[] args) {
        // Break and Continue 
        int i=0;

        while (true) {

            System.out.println(i);
            i++;
            if(i>5)
                break;
            
        }

        while(i<10){
            System.out.println(i);
            i++;
            if(i==8)
                continue;
            
        }
    }
    
}
