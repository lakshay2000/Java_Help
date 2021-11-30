package Encapsulation;

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password=pass;
    }
}

// Access Modifier is of 4 types in java and 3 types in C++
// Public - anyone can access it
// Protected - only sub-classes from other packages can access it
// Private - it can only access within the class
// Default - anyone can access it inside the given package but not any other    package

// We can access private members of a class through getters and setters 

public class sEncapsulation {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Apna College";
        a1.email="hello@gmail.com";
        // a1.password="abcd";
        a1.setPass("abcd");
        a1.getPass();
    }
    
}
