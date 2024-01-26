import java.util.Scanner;

public class Slide47_Chuong2 {
    public static void main(String[] args) {
        int sum = 0; 
        int n;
        Scanner scanner = new Scanner(System.in);

        while (sum <= 100) {
            System.out.print("Nhap vao so tu nhien n: ");
            n = scanner.nextInt();

            sum += n;
           
        }
     System.out.println("Tong: " + sum);
        scanner.close(); 
    }
}
