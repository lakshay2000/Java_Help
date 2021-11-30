import java.util.Arrays;

public class dArray {
    public static void main(String[] args){

        
        // Arrays are non-primitive type
        
        // One dimensional array 
        int[] marks= new int[3];
        
        marks[0]=0;
        marks[1]=1;
        System.out.println(marks[2]);
        // if not inititialised then it takes 0 or null by default unlike C++ which takes any garbage value 
        
        // Lenght 
        
        System.out.println(marks.length);
        
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        
        int[] mark = {8,5,6,4};
        
        // Two dimensional array 


        int[][] finalMarks={{97,98,99},{90,91,92}};
        System.out.println(finalMarks[0][1]);


        
    }

    
}
