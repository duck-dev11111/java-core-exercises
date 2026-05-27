package bt4;

public class Main {
	public static void main(String[] args) {
        System.out.println("           KHỞI TẠO TÀI KHOẢN              ");
        BankAccount myAccount = new BankAccount("123456789", "Nguyen Van A", 500000);
        System.out.println("Số dư ban đầu: " + myAccount.getBalance());
        //System.out.println("\n         tien am phu ak         ");
        //myAccount.deposit(-50000);
        //System.out.println("\n         ngheo lam r       ");
        //myAccount.withdraw(1000000);
        System.out.println("\n         ngon luon          ");
        myAccount.deposit(200000); 
        myAccount.withdraw(150000);
        System.out.println("\nSố dư cuối cùng của tài khoản là: " + myAccount.getBalance());
}}
