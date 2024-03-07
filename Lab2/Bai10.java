import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo giá trị
        String chuoiKiTu;
        char kiTu;
        int demKiTu = 0;

        // Nhập chuỗi và kiểm tra độ dài
        do {
            System.out.print("Nhập chuỗi ký tự (tối đa 80 ký tự): ");
            chuoiKiTu = scanner.nextLine();
        } while(chuoiKiTu.length() > 80);

        System.out.print("Nhập ký tự bạn muốn đếm: ");
        kiTu = scanner.next().charAt(0);

        // Vòng lặp đếm ký tự
        for(int i = 0; i < chuoiKiTu.length(); i++) {
            if(chuoiKiTu.charAt(i) == kiTu) {
                ++demKiTu;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kiTu + " là: " + demKiTu);
    }
}
