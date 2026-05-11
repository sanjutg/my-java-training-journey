import java.util.Arrays;
public class arraymethods {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,11,12,13,14,15};
        // arraymethods.copyArray(arr);
        // arraymethods.copyArray2(arr);
        // arraymethods.sortArray(arr);
        // arraymethods.reverseArray(arr);
        // System.out.println("\nReversed Array: ");
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        arraymethods.mergeArrays(arr, new int[]{16,17,18,19,20});

    }
    // method to copy an array
    public static void copyArray(int [] arr){
        int [] copyArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }
        System.out.println("Copied Array: ");
        for(int num : copyArr){
            System.out.print(num + " ");
        }
    }
    // method to copy an array using System.arraycopy
    public static void copyArray2(int[] arr){
        int [] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        System.out.println("Copied Array using System.arraycopy: ");
        for(int num : copyArr){
            System.out.print(num + " ");
        }
    }
    // sorting an array using Arrays.sort()
    public static void sortArray(int [] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    // array reversal
    public static void reverseArray(int [] arr){
        int [] revarr = new int [arr.length];
        int temp;
        int j = arr.length-1;
        for(int i=0; i<=arr.length-1; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    // merging of two arrays
    public static void mergeArrays(int [] arr1, int arr2[]){
        int [] merarr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merarr, 0, arr1.length);
        System.arraycopy(arr2, 0, merarr, arr1.length, arr2.length);
        System.out.println("Merged Array: ");
        for (int num : merarr){
            System.out.print(num + " ");
        }
    }
}