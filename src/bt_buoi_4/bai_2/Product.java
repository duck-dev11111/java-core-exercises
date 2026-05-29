package bt_buoi_4.bai_2;
public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        if (price <= 0) {
            this.price = 1;
        } else {
            this.price = price;
        }
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("Lỗi: Giá bán phải lớn hơn 0!");
        }
    }
    public void setQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Lỗi: Số lượng tồn kho không được là số âm!");
        }
    }
    public void displayInfo() {
        System.out.println("Mã SP: " + productId 
                         + " | Tên SP: " + productName 
                         + " | Giá: " + price 
                         + " | Số lượng tồn kho: " + quantity);
    }
}