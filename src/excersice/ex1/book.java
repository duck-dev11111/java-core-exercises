package excersice.ex1;

public class book {
	private String title;
	private String author;
	private double price;
	private int quantity;
	public book(String title,String author,double price,int quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public void displayInfo() {
		System.out.println("book: " + title + "\nauthor: " + author + "\nprice: " + price + "\nquantity: " + quantity);
	}
	public void sell(int amount) {
		this.quantity -= amount;
	}
}