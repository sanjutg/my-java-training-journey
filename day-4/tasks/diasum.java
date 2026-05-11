package tasks;
public class diasum {
    public static void main(String[] args) {
    int[][] arr = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
    
    int n  = arr.length;
    int pd = 0;
    int sd = 0;

    for(int r = 0; r < n; r++){
        for(int c = 0; c < n; c++){
            if(r == c){
                pd = pd + arr[r][c];
            }
            if(r + c == n - 1){
                sd = sd + arr[r][c];
            }
        }
    }
    System.out.println("Primary Diagonal Sum: " + pd);
    System.out.println("Secondary Diagonal Sum: " + sd);

}
}
