package tasks;
public class studarr {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 78, 92},
            {88, 76, 95, 89},
            {91, 84, 87, 93}
        };
        System.out.println("Student Totals:");
        for(int i = 0; i < marks.length; i++){
            int sum = 0;
            for(int j = 0; j < marks[i].length; j++){
                sum = sum + marks[i][j];
            }
            System.out.println("Student " + (i + 1) + " Total: " + sum);
        }
        System.out.println();
        System.out.println("Subject Totals:");
        for(int j = 0; j < marks[0].length; j++){
            int sum = 0;
            for(int i = 0; i < marks.length; i++){
                sum = sum + marks[i][j];
            }
            System.out.println("Subject " + (j + 1) + " Total: " + sum);
        }
    }
}