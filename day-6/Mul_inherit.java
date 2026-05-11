class Car{
    void Start(){
        System.out.println("The car will be started");
    }
}
class Audi extends Car{
    void Drive (){
        System.out.println("The audi is started and moved");
    }
}
class Bmw extends Audi{
    void Ride(){
        System.out.println("The Bmw is started and moved after audi");
    }
}
public class Mul_inherit {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.Start();
        b.Drive();
        b.Ride();
    }
}
// multi-level inheritance = grandparent class (car) => parent class (audi) => child class(bmw)
// super keyword => describes the parent class, used in inheritance to access the parent class methods   
// this keyword => describes the child class 