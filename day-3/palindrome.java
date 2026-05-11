import java.util.*;
public class palindrome {
    
    public int reverse (int num){
        int rev = 0;
        while (num!=0){
            int place  = num%10;
            rev = rev*10 +place;
            num = num/10;
        }
        return rev; 

    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       palindrome obj = new palindrome();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = obj.reverse(num); //here we are creating a variable "rev" to store the updated value and then the method is called with passing the num as argument and the returned value is stored in "rev" variable.
        if (num == rev){
            System.out.println("The number is a palindrome.");
        }
        else {
            System.out.println("The number is not a palindrome.");
        }
       
    }
}
