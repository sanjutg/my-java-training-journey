
public class encaptypes {
    public static void main(String[] args) {
            Student s1 = new Student("S12345");
            System.out.println("Student ID: " + s1.getStudid());
    }
    static class Student{
        private String studid;
        public Student (String id){
            this.studid = id;
        }
        public String getStudid() {
            return studid;
        }
    }

}

