public class assignment{
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x;
        x +=y;
        y -=x;
        z *=y;
        x /=z;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
         assignment ass = new assignment();
    ass.relationalOperators();

    }
    public void relationalOperators() {
        int a = 5;
        int b = 10;
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
    
    
}