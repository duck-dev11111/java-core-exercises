package bt_buoi_4.bai_1;
public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công " + amount + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");    
        }   
    } 

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; 
            System.out.println("Rút thành công " + amount + " từ tài khoản.");
        } else {
            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ!");
        }   
    }
}