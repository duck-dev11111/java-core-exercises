package bt4;
public class main2 {
	    public static void main(String[] args) {
	        System.out.println("             1. KHỞI TẠO SẢN PHẨM (DỮ LIỆU SAI)         ");
	        Product p = new Product("SP01", "Bánh mì", -5000, -10); 	        
	        p.displayInfo();
	        System.out.println("\n           2. CẬP NHẬT LẠI DỮ LIỆU QUA SETTER         ");
	        p.setPrice(15000);
	        p.setQuantity(50);
	        System.out.println("\n           3. THÔNG TIN SAU KHI CẬP NHẬT             ");
	        p.displayInfo();
	    }
}

