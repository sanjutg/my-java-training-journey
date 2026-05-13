public class abstractEg {
    public static void main(String[] args) {
        abstractEg outer = new abstractEg();
        B b = outer.new B();
        b.display();
    }

 interface A{
    int a = 10;
    default void display(){
        System.out.println("This is interface A with a default method");
    }
 }
class B implements A{
   public void display(){
        System.out.println("This is class B implementing interface A");
    }
}
}
