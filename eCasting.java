public class eCasting {

    public static void main(String[] args){
        // Casting-Changing one type to another type 
        // Casting is two type
        // -> Implicit 
        // -> explicit 

        // Implicit Casting -> int variable (18) is getting stored in double variable 
        double price = 100;
        double FinalPrice =price + 18;
        System.out.println(FinalPrice);


        // Explicit Casting 
        int p=100;
        int fp=p+ (int)18.18;
        System.out.println(fp);

        // Constants (final keyword)

        final float PI =3.14F;
        // PI = 3.4;
        System.out.println(PI);
        

    }
    
}
