import java.util.*;
public class studentSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sn = new ArrayList<>();
        ArrayList<String> sr = new ArrayList<>();
        ArrayList<String> sm= new ArrayList<>();
        ArrayList<String> sd = new ArrayList<>();
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        System.out.println("Enter roll no to search:");
        String searchRollNo = sc.next();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the name of student " + (i+1) + ":");
            sn.add(sc.next());
            System.out.println("Enter the roll number of student " + (i+1) + ":");
            sr.add(sc.next());
            System.out.println("Enter the marks of student " + (i+1) + ":");
            sm.add(sc.next());
        }
        sd.addAll(sr);
        sd.addAll(sn);
        sd.addAll(sm);
        for(int i = 0 ; i<n;i++){
            if(sd.get(i).equals(searchRollNo)){
                System.out.println("Student found!");
                System.out.println("Name: " + sn.get(i));
                System.out.println("Roll Number: " + sr.get(i));
                System.out.println("Marks: " + sm.get(i));
                break;
            }
        }
    }
}