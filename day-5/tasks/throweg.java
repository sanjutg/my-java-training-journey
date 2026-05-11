class Invalid extends Exception {
   Invalid(String message) {
        super(message);
    }
}
class error extends Exception{
    error(String message){
        super(message);
    }
}
public class throweg {
    public static void main(String[] args) {
        int a = 10;
        double b = 15.5;
        try {
            int result = (int)(a + b);
            System.out.println("Result: " + result);
            throw new Invalid("Change variable b to int to avoid decimal values.");
        }
        catch(Invalid e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("All errors were displayed and handled successfully.");
        }

        // Example of throwing a custom error
        try {
            int a1 = 10;
             int b1 = 0;
                if (b1 == 0) {
                    throw new error("Cannot divide by zero.");
                }
                int result = a1 / b1;
                System.out.println("Result: " + result);
        }
        catch(error e) {
            System.out.println(e.getMessage());
            
        }
    }
}