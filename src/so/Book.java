package so; 
import java.util.Scanner; 
public class Book {
    String title;
    String author;
    double originalPrice;
    public void nhap() {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Nhập tiêu đề sách: ");
        title = scanner.nextLine();       
        System.out.print("Nhập tên tác giả: ");
        author = scanner.nextLine();        
        System.out.print("Nhập giá gốc: ");
        originalPrice = scanner.nextDouble();} 
    public double tinhGiaBan() {
        return originalPrice * 1.2;}
    public void hienThi() {
        System.out.println("\n--- THÔNG TIN SÁCH ---");
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá gốc: " + originalPrice);
        System.out.println("Giá bán (đã tăng 20%): " + tinhGiaBan()); }
    public static void main(String[] args) {
        Book sach1 = new Book();       
        System.out.println("Vui lòng nhập thông tin cho cuốn sách:");
        sach1.nhap();        
        sach1.hienThi();
    }
}