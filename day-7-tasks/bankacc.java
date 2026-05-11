import java.util.Scanner;
public class bankacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account holder's name:");
        String name = sc.nextLine();
        System.out.println("Enter the initial balance:");
        double balance = sc.nextDouble();
        System.out.println("Deposit amount:");
        double deposit = sc.nextDouble();
        System.out.println("Withdrawal amount:");
        double withdrawal = sc.nextDouble();
        bankacc obj = new bankacc();
        balance = obj.deposit(deposit, balance);
        balance = obj.withdraw(withdrawal, balance);
        obj.display(name, balance, withdrawal, deposit);
    }
    public double deposit(double amount, double balance){
        balance += amount;
        return  balance;
    }
    public double withdraw(double amount, double balance){
        if(amount > balance){
            System.out.println("Insufficient funds.");
            System.out.println("Current balance: " + balance);
            System.exit(0);
            return balance;
        }
        else{
            balance -= amount;
            return balance;
        }
    }
       public void display(String name, double balance, double withdrawal, double deposit){
        System.out.println("Account holder: " + name);
        System.out.println("Current balance: " + balance);
        System.out.println("Total deposit: " + deposit);
        System.out.println("Total withdrawal: " + withdrawal);
    }
}

