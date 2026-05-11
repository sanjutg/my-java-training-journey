import java.util.*;
public class amstrong {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int place = 0;
        int temp = num;
        amstrong obj = new amstrong();
        sum = obj.getAmstrong(num, sum, place);
        if(temp == sum){
            System.out.println("The number is an Amstrong number.");
        }
        else{
            System.out.println("The number is not an Amstrong number.");
        }
    }
    public int getAmstrong(int num, int sum, int place){
        while(num!=0){
            place = num%10;
            sum = sum + place*place*place;;
            num = num / 10;
        }
        return sum;
    }
}
