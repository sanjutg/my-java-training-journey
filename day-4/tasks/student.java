package tasks;

public class student {
    public static void main(String[] args) {
        int[] marks = new int[]{85, 90, 78, 92, 88};
        System.out.println("Student Marks:");
        for(int i = 0; i < marks.length; i++){
            System.out.println("Marks[" + i + "]: " + marks[i]);
        }

int count = marks.length;
System.out.println("Total student's  Marks: " + count);
    
    for(int i = 0;i<marks.length;i++){
        int avg = (int)(marks[i]/count); // Calculate average marks
        System.out.println("Average[" + i + "]: " + avg);

    }
    int overallAvg = 0;
    for(int i = 0; i < marks.length; i++){
        overallAvg += marks[i];
    }
    overallAvg = overallAvg / count;
    System.out.println("Overall Average Marks: " + overallAvg);
}
}

