package excersice.ex1;

public class Main {
	public static void main(String[] args) {
		book de_men_phieu_luu_ki = new book("dế mèn phiêu lưu kí" , "Tô Hoài" , 110000 , 100 );	
		book lap_trinh_java = new book("lập trình java", "đoán xem ", 10000000, 1);
		de_men_phieu_luu_ki.displayInfo();
		de_men_phieu_luu_ki.sell(5);
	}
}
