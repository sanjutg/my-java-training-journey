class Bus{
    String type = "default";
    Bus(){
    }
    Bus(String type){
        
        this.type = type;
    }
}
public class App {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        System.out.println(b1.type);
        Bus b2 = new Bus("school bus");
        System.out.println(b2.type);
    }
}
