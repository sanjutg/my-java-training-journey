public class callbyvalue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        callbyvalue obj = new callbyvalue();
        System.out.println("Before calling method: a = " + a + ", b = " + b);
        obj.swap(a, b);
        System.out.println("After calling method: a = " + a + ", b = " + b);
    }
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside method: a = " + a + ", b = " + b);
    }
}
