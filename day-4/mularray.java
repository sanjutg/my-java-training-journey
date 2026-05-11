import java.util.Arrays;
public class mularray {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        int [][] arr2 = {{11,12,13},{14,15,16}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr2)); 
        //deepToString is used for multi-dimensional arrays
        // tostring is used for single-dimensional arrays
        mularray.printMultiDimensionalArray(arr2);
    }

//printing multi-dimensional arrays using for each loop
    public static void printMultiDimensionalArray(int [][] arr){
        for(int [] innerArr : arr){
            for(int num : innerArr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}