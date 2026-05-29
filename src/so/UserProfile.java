package so;
public class UserProfile {
    private String username;
    private String email;
    private String password;
    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "123456";
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String newEmail) {
        if (newEmail.contains("@")) {
            this.email = newEmail;
            System.out.println("-> Cập nhật email thành công: " + this.email);
        } else {
            System.out.println("-> Lỗi: Email không hợp lệ (phải chứa ký tự '@').");
        }
    }
    public void changePassword(String oldPassword, String newPassword) {
        if (!this.password.equals(oldPassword)) {
            System.out.println("-> Lỗi: Mật khẩu hiện tại không đúng.");
        } else if (newPassword.length() < 6) {
            System.out.println("-> Lỗi: Mật khẩu mới phải có từ 6 ký tự trở lên.");
        } else {
            this.password = newPassword;
            System.out.println("-> Đổi mật khẩu thành công!");
        }
    }
}