package btvn2;

public class Account {
	private String accountNumber;
	private String ownerName;
	private double balance;

	public Account(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("nap thanh cong: $" + amount);
		} else {
			System.out.println("so tien nap phai lon hon 0!");
		}
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("giao dich that bai: so du ko du");
		} else if (amount > 0) {
			balance -= amount;
			System.out.println("rut tien thanh cong: " + amount);
		} else {
			System.out.println(" so tien rut phai lon hon 0!");
		}
	}

	public void showBalance() {
		System.out.println(" chu the: " + ownerName + "so du hien tai: $" + balance);
	}

	public static void main(String[] args) {
		Account myAccount = new Account("6125613521", "Nguyen Minh Duc", 1000000000);
		System.out.println("       Trang thai ban dau                 ");
		myAccount.showBalance();
		System.out.println("\n            thuc hien giao dich             ");
		myAccount.deposit(500);
		myAccount.withdraw(200);
		System.out.println("\n          ket qua cuoi cung             ");
		myAccount.showBalance();
	}

}
