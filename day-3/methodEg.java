public class methodEg {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        methodEg obj = new methodEg();
        methodEg.method1(); // calling method without return type and without  parameter (static method)
        int result2 = obj.method2(); 
        System.out.println("Result of method2: " + result2);
        int result3 = obj.method3(a, b); 
        System.out.println("Result of method3: " + result3);
        obj.method4(a, b); 
        System.out.println("Method4 executed");
        
    }
    //1. method without return type and without parameter
    public static void method1() {
        System.out.println("This is method 1");
    }
    //2. method with return type and without parameter
    public int method2() {
        return 10;
    }
    //3. method with return type and with parameters
    public int method3(int a, int b) {
        return a + b;
    }
    //4. method without return type and with parameters
    public void method4(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }

    //void method WITH return keyword is possible but it will not return any value and the return statement will just exit the method. For example:
    public void method5() {
        System.out.println("This is method 5");
        return; // This will exit the method, but it does not return any value.
    }
    
}
