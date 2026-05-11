package tasks;

public class employee {
    public static void main(String[] args) {
        int bonus = 0;
        int [] salary = new int[]{50000, 60000, 55000, 70000, 65000};
        System.out.println("Employee Salaries (original):");
        for(int i= 0; i < salary.length; i++){
            System.out.println("Salary[" + i + "]: " + salary[i]);
        }
        for(int i = 0; i<salary.length;i++){
            bonus = (int)(salary[i]+(salary[i]*0.1)); // Calculate 10% bonus
            System.out.println("Bonus[" + i + "]: " + bonus);
        }
    }
}
