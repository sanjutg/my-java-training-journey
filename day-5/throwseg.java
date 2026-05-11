
public class throwseg {
    public static void main(String[] args) {
        throwseg outer = new throwseg();
        Sample o = outer.new Sample();
        try{
            o.display();
        }
        catch(NullPointerException e){
            System.out.println("The string canot be empty");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    class Sample{
        void display() throws NullPointerException{
            String s = null;
            System.out.println(s.length());
        }
    }
}
