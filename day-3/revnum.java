import java.util.*;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int place = 0;
        revnum obj = new revnum();
        rev = obj.reverse(num, rev, place);
        System.out.println("Reversed number: " + rev);
    }
    public int reverse(int num, int rev, int place){
        while(num!=0){
            place = num % 10;
            rev = rev * 10 + place;
            num = num / 10;
        }
        return rev;
    }
}

