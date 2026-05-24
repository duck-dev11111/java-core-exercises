package btvn2;

public class Student {
	private String id;
	private String name;
	private double gpa;

	public Student(String id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public String rank() {
		if (gpa >= 8.0) {
			return "gioi";
		} else if (gpa >= 6.5) {
			return "kha";
		} else {
			return "trung binh";
		}
	}

	public void display() {
		System.out.println("điểm : " + gpa);
		System.out.println("xếp loại : " + rank());
		
	}

	public static void main(String[] args) {
		Student[] danhSachSV = new Student[3];
		danhSachSV[0] = new Student("SV01", "khoi:   ", 11.11);
		danhSachSV[1] = new Student("SV02", "khang nghu:    ", 2.2);
		danhSachSV[2] = new Student("SV03", "kien:    ", 1.1);
		System.out.println("     DANH SACH SINH VIEN      ");
		for (int i = 0; i < danhSachSV.length; i++) {
			danhSachSV[i].display();
		}
	}
}