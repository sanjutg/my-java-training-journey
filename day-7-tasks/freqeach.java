import java.util.*;
public class freqeach {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter a string");       
        String str = sc.nextLine();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j<str.length();j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            System.out.println( ch + " -> " + count + " times");
        }
    }
}
