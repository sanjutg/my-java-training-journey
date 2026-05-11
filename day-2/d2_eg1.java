import java.util.Scanner;

public class d2_eg1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scn.nextLine();
        String [] str2 = str.split(" ");
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a")); 
        System.out.println(str.contains("hi"));
        System.out.println(str.charAt(0)); 
        System.out.println(str.replace("a", "@"));

    }
}