package Day_6;

class Bank {
    private int balance = 1000;
    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " is trying to withdraw: " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Transaction Interrupted");
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for " + user);
        }

        System.out.println("Balance after " + user + "'s transaction: " + balance);
    }
}

class UserThread extends Thread {
    Bank bank;
    int amount;

    UserThread(Bank bank, String name, int amount) {
        super(name); 
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(amount, Thread.currentThread().getName());
    }
}

public class MultiThreadBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();

        
        UserThread u1 = new UserThread(bank, "User-1", 500);
        UserThread u2 = new UserThread(bank, "User-2", 400);
        UserThread u3 = new UserThread(bank, "User-3", 300);

        u1.start();
        u2.start();
        u3.start();
    }
}
