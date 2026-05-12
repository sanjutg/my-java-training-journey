public class Ball {
    boolean usuable;
    Ball ballInstance;
    public static void main(String[] args) {
        Ball myball = new Ball();
        System.out.println(myball.usuable);
        System.out.println(myball.ballInstance.usuable);
       
    }
}
//object's default value is null and boolean's default value is false. 
// so when we try to access ballInstance.usuable it will throw NullPointerException 
// because ballInstance is null and we are trying to access its property.
// non-static variables cannot be accessed from a static context, 
// but static methods can be accessed in non-static context, so we can access main method from the alphaInner class.