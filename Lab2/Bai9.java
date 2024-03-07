import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Nhập chuỗi ký tự
        System.out.print("Nhập chuỗi ký tự: ");
        String chuoiKiTu = scanner.nextLine();

        // Khởi tạo giá trị
        int demChuThuong = 0, demChuHoa = 0, demChuSo = 0;

        // Vòng lặp
        for(int i = 0; i < chuoiKiTu.length(); i++) {
            if(chuoiKiTu.charAt(i) >= 97 && chuoiKiTu.charAt(i) <= 122) {
                ++demChuThuong;
            } else if (chuoiKiTu.charAt(i) >= 65 && chuoiKiTu.charAt(i) <= 90) {
                ++demChuHoa;
            } else if (chuoiKiTu.charAt(i) >= 48 && chuoiKiTu.charAt(i) <= 57) {
                ++demChuSo;
            } else {
                System.out.println("Chuỗi có ký tự không xác định");
            }
        }

        System.out.println("Số ký tự viết thường trong chuỗi là: " + demChuThuong);
        System.out.println("Số ký tự viết hoa trong chuỗi là: " + demChuHoa);
        System.out.println("Số ký tự chữ số trong chuỗi là: " + demChuSo);
    }
}
