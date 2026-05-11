import java.util.Scanner;

public class righttri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right triangle: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        righttri.opptri(rows);
    }
    public static void opptri(int rows){
        System.out.println();
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
