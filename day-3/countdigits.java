import java.util.*;
public class countdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        countdigits obj = new countdigits();
        count = obj.count(num, count);
        System.out.println("Number of digits: " + count);
    }
    public int count(int num, int count){
        while(num!=0){
            num = num / 10;
            count++;
        }
        return count;
    }

}


