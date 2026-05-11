
public class abstractEg {
    public static void main(String[] args) {
        abstract class Animal {
            // Abstract method (does not have a body)
            public abstract void sound();
            // Regular method
            public void sleep() {
                System.out.println("Zzz");
            }
        }
        //creates subclass of abstract class as we cannot create object of abstract class
        class Dog extends Animal {
            @Override
            public void sound() {
                System.out.println("Woof");
            }
        }
        Animal dog = new Dog();
        dog.sound(); // Output: Woof
        dog.sleep(); // Output: Zzz

    }
    
    }

// Abstract class cannot be instantiated, but it can be subclassed.
        // An abstract class can have abstract methods (without implementation) and concrete methods (with implementation).
        // Abstract classes are used to provide a common base for subclasses and to define a common interface for them.
        //creates subclass of abstract class as we cannot create object of abstract class
        //Abstract class can have constructors, but they cannot be used to create objects of the abstract class. 
        // They are typically used to initialize common properties of the subclasses.