import java.util.Scanner;
public class sumnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        sumnumber obj = new sumnumber();
        sum = obj.sum(num, sum);
        System.out.println("Sum of digits: " + sum);
    }
    public int sum(int num, int sum){
        while(num!=0){
            sum = sum + num%10;
            num = num / 10;
        }
        return sum;
    }

}
