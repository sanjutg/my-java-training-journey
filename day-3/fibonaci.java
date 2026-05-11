import java.util.*;
public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        fibonaci obj = new fibonaci();
        System.out.println("Fibonacci series: ");
        for(int i=0; i<n; i++){
            System.out.print(obj.fib(i) + " ");
        }
    }
    public int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}


//recursion is a programming technique where a function calls itself in order to solve a problem. 
// It typically involves a base case that stops the recursion and a recursive case that breaks the problem into smaller subproblems.
