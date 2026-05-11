import java.util.*;
public class factorialOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        factorialOfNumber obj = new factorialOfNumber();
        fact = obj.factorial(num, fact);
        System.out.println("Factorial: " + fact);
    }
    public int factorial(int num, int fact) {
        while(num!=0){
            fact = fact * num;
            num = num - 1;
        }
        return fact;
    }
    
}
