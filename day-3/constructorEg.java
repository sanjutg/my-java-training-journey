
public class constructorEg {
    //1. default constructor
    class student{
        student(){
            System.out.println("This is a default constructor of student class");
        }
    }
    //2. parameterized constructor
    class teacher{
        int id;
        String name;
        teacher(int id, String name){
            this.id = id;
            this.name = name;
        }
        void display(){
            System.out.println("This is a parameterized constructor of teacher class");
            System.out.println("ID: " + id + ", Name: " + name); //the parameters will be passed when the object is created and the values will be assigned to the instance variables using the this keyword. 
        }

    }
    //3. static constructor
    static class staticConstructor{
        static {
            System.out.println("This is a static constructor of staticConstructor class");
        }
    }
    //4.copy constructor
    class copyConstructor{
        int id;
        String name;
        copyConstructor(int id, String name){
            this.id = id;
            this.name = name;
        }
        copyConstructor(copyConstructor obj){ //this constructor takes an object of the same class as a parameter and copies the values of the instance variables from the passed object to the new object.
            this.id = obj.id;
            this.name = obj.name;
        }
        void display(){
            System.out.println("This is a copy constructor of copyConstructor class");
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
    public static void main(String[] args) {
        constructorEg obj = new constructorEg();
        student s1 = obj.new student(); 
        //creating an object of student class to call the default constructor

        teacher t1 = obj.new teacher(1, "John");
         //creating an object of teacher class to call the parameterized constructor
        t1.display();   

        //calling the display method to show the values of id and name
        staticConstructor sc = new staticConstructor();
         //creating an object of staticConstructor class to call the static constructor
        copyConstructor cc1 = obj.new copyConstructor(2, "Jane"); 
        //creating an object of copyConstructor class to call the parameterized constructor


        copyConstructor cc2 = obj.new copyConstructor(cc1); 
        //creating an object of copyConstructor class to call the copy constructor and passing cc1 as a parameter
        cc2.display();
         //calling the display method to show the values of id and name of cc2 which are copied from cc1

    }
       
}
