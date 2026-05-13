import java.util.Random;

public class Main {
    public static void main(String[] args) {
       String[] codes = {"CA", "JP", "US","CA", "UK"};
       int count = 0;
       for (String code : codes) {
           if (code.equals("CA")) {
               continue;
           }
           else{
            count++;
           }
       }
       System.out.println(count);
    }
}
