class Person {
    private double balance;

    public void setBalance(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setBalance(15000.56);
        System.out.println("Balance: " + p.getBalance());
    }
}
