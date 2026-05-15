package so;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();        
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();         
        int tempA = a;
        int tempB = b;       
        a = Math.abs(a);
        b = Math.abs(b);       
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }       
        System.out.println("Ước chung lớn nhất của " + tempA + " và " + tempB + " là: " + a);       
        scanner.close();
    }
}