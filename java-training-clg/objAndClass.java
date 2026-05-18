
public class objAndClass {
    static int objectCount = 0;

    public static void main(String[] args) {

       student s = new student(101, "Alice", "Java Programming");
        teacher t = new teacher(201, "Mr. Kumar", "Java Programming");
        course c = new course(301, "Mr. Kumar", "Java Programming");
        library l = new library(401, "Alice", "Core Java");
        department d = new department("Computer Science");

        s.displayStudent();
        t.displayTeacher();
        c.displayCourse();
        l.displayLibrary();
        d.displayDepartment();

        System.out.println("objAndClass instances created: " + objectCount);
    }
}

class student {
    int id;
    String name;
    String course;

    student(int id, String name, String course) {
        objAndClass.objectCount++;
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("course: " + course);
    }
}

class teacher {
    int id;
    String tname;
    String course;

    teacher(int id, String tname, String course) {
            objAndClass.objectCount++;
        this.id = id;
        this.tname = tname;
        this.course = course;
    }

    public void displayTeacher() {
        System.out.println("teacher name: " + tname);
        System.out.println("id: " + id);
        System.out.println("course: " + course);
    }
}

class course {
    int id;
    String tname;
    String course;

    course(int id, String tname, String course) {
        objAndClass.objectCount++;
        this.id = id;
        this.tname = tname;
        this.course = course;
    }

    public void displayCourse() {
        System.out.println("teacher name: " + tname);
        System.out.println("id: " + id);
        System.out.println("course: " + course);
    }
}

class library {
    int id;
    String name;
    String book;

    library(int id, String name, String book) {
        objAndClass.objectCount++;
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public void displayLibrary() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("book: " + book);
    }
}

class department {
    String deptname;

    department(String deptname) {
        objAndClass.objectCount++;
        this.deptname = deptname;
    }

    public void displayDepartment() {
        System.out.println("department name: " + deptname);
    }
}

// when the cnstructor is created each time, the object is created too. 
// So incrementing the count at constructor means counting the object
