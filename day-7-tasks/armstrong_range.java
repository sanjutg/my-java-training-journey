import java.util.*;
public class armstrong_range {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting number: ");
    int start = sc.nextInt();
    System.out.println("Enter the ending number: ");
    int end = sc.nextInt();
    System.out.print("Armstrong numbers between " + start + " and " + end + " are:");
    for(int i = start; i <= end; i++){
        if(isArmstrong(i)){
            System.out.print (i + " ");
        }
    }
    System.out.println();
}
public static boolean isArmstrong(int num){
    int sum = 0;
    int temp = num;
    while(temp != 0){
        int digit = temp % 10;
        sum += Math.pow(digit, 3);
        temp /= 10;
    }
    return sum == num;
}
}