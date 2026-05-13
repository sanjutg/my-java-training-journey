public class Test {
    static int a; // Defaults to 0
    int b;        // Defaults to 0 for each new object instance

    public void incr() {
        int c = a++; // Assigns current value of 'a' to 'c', then increments 'a'
        b++;         // Increments instance variable 'b'
        c++;         // Increments local variable 'c'
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.incr(); // First invocation
        a++;         // Increments static variable 'a' directly
        test = new Test();
        test.incr(); // Second invocation on a brand-new object
    }
}
