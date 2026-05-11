import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element: " + secondLargest);

    }
}
