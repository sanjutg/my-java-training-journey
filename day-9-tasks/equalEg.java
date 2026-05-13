import java.util.Random;

public class equalEg {
    public static void main(String[] args) {
       String a  = "java";
       String b = new String("java");
       System.out.println(a == b); // false, because 'a' and 'b' are different objects in memory
       System.out.println(a.equals(b)); // true, because 'a' and 'b'
    }
}
