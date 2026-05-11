import java.util.*; 
public class matMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int cols1 = sc.nextInt();
        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int cols2 = sc.nextInt();
        if (cols1 != rows2) {
            System.out.println(" rows and colums should be same for multiplication");
            return;
        }else{
            int[][] matrix1 = new int[rows1][cols1];
            int[][] matrix2 = new int[rows2][cols2];
            int[][] result = new int[rows1][cols2];
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " "); }
                System.out.println();
            }
        }
    }
}
