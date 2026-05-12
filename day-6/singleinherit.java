class carBase {
    void drive(){
        System.out.println("car started driving");
    }
}
class bmw extends carBase{
    void start(){
        System.out.println("car starts automatically");
    }
}
public class singleinherit {
    public static void main(String[] args) {
        bmw b = new bmw();
        // b.drive();
        b.start();
    }
}
