import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng và số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng A: ");
        int soLuongPhanTu = scanner.nextInt();
        int[] mangA = new int[soLuongPhanTu];
        for(int i = 0; i < mangA.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + " của mảng: ");
            mangA[i] = scanner.nextInt();
        }
        System.out.println();

        // In ra màn hình trước khi sắp xếp
        System.out.print("Mảng trước khi sắp xếp là: ");
        for(int i = 0; i < mangA.length; i++) {
            System.out.print(mangA[i] + " ");
        }
        System.out.println();

        // Sắp xếp mảng tăng dần
        for(int i = 0; i < mangA.length; i++) {
            for(int j = i + 1; j < mangA.length; j++) {
                if(mangA[i] > mangA[j]) {
                    int temp = mangA[i];
                    mangA[i] = mangA[j];
                    mangA[j] = temp;
                }
            }
        }

        // In ra mảng sau khi sắp xếp
        System.out.print("Mảng sau khi sắp xếp tăng dần là: ");
        for(int i = 0; i < mangA.length; i++) {
            System.out.print(mangA[i] + " ");
        }
    }
}
