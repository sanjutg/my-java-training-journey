public class Test2 {
    static int var2 = 200;
    public static void print(){
        System.out.println(var2);
    }
    public void print(int var1){
        System.out.println(var1);
        var2 = var2 +var1;
        print();
    }
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.print(100);
       // print();
    }
}
