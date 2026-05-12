public class alpha {
    public static void main(String[] args) {
        alpha a = new alpha();
        alphaInner ai = a.new alphaInner(); // Creating an instance of the inner class as it private
        ai.display();
    }
    private class alphaInner {
        void display() {
            System.out.println("This is an inner class.");
        }
    }
}