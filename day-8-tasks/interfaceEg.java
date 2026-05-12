public class interfaceEg {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        
    }
}

 interface InnerinterfaceEg {
    int a = 10;    
}
class A implements InnerinterfaceEg {
    void display(){
            System.out.println(a);
    }
}


// Interface is designed to eliminate the problem of multiple inheritance in java. 
// It is a blueprint of a class that contains static constants and abstract methods. The interface is used to achieve abstraction and multiple inheritance in java. It is a collection of abstract methods and static constants
// syntax of interface
// interface interface_name{
//     // abstract methods
// }
// A class that implements an interface must implement all the methods declared in the interface.