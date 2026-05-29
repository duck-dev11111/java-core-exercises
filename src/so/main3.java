package so;
public class Main {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("nguyenvana", "nva_gmail.com");
        System.out.println("Tạo tài khoản thành công: " + user.getUsername());       
        System.out.println("\n--- THỬ ĐỔI EMAIL ---");
        user.setEmail("nva@gmail.com");
        System.out.println("\n--- THỬ ĐỔI MẬT KHẨU ---");
        System.out.println("1. Nhập sai mật khẩu cũ:");
        user.changePassword("sai_mat_khau", "matkhau123");
        System.out.println("\n2. Mật khẩu mới quá ngắn:");
        user.changePassword("123456", "abc");
        System.out.println("\n3. Thông tin hoàn toàn hợp lệ:");
        user.changePassword("123456", "matkhau123");
    }
}
