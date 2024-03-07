import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Xác định kích thước của mảng 2 chiều
        System.out.print("Nhập số phần tử hàng ngang của mảng 2 chiều: ");
        int soHangNgang = scanner.nextInt();
        System.out.print("Nhập số phần tử hàng dọc của mảng 2 chiều: ");
        int soHangDoc = scanner.nextInt();
        
        // Khai báo và nhập giá trị cho mảng
        int[][] mangHaiChieu = new int[soHangNgang][soHangDoc];
        for(int i = 0; i < mangHaiChieu.length; i++) {
            for(int j = 0; j < mangHaiChieu[i].length; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + (i+1) + "][" + (j+1) + "]: ");
                mangHaiChieu[i][j] = scanner.nextInt();
            }
        }

        // Khởi tạo biến max và tìm giá trị lớn nhất
        int maxGiaTri = mangHaiChieu[0][0];
        for(int i = 0; i < mangHaiChieu.length; i++) {
            for(int j = 0; j < mangHaiChieu[i].length; j++) {
                if(mangHaiChieu[i][j] > maxGiaTri) {
                    maxGiaTri = mangHaiChieu[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + maxGiaTri);
    }
}
