import java.util.Arrays;
public class arrayeg {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
       int [] arr2 = {1,2,3,4,5};
         for(int i=0; i<arr2.length; i++){
          System.out.println(arr2[i]);
         }
         System.out.println(Arrays.toString(arr2));
    }
}