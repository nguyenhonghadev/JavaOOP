/**
 * Demo
 */
import java.util.Scanner;
public class Slide30_Chuong2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n (n > 0): ");
        int n = scanner.nextInt();

        // Kiểm tra điều kiện n > 0
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen n >0.");
        } else {
            // Tính tổng các chữ số của số n
            int tong = 0;
            int so = n;

            // Duyệt từng chữ số và cộng vào tổng
            while (so > 0) {
                tong += so % 10;  // Lấy chữ số cuối cùng và cộng vào tổng
                so /= 10;         // Loại bỏ chữ số cuối cùng
            }

            // In kết quả
            System.out.println("Tong ca chu so cua " + n + " là: " + tong);
        }

        
        scanner.close();  
    }
}