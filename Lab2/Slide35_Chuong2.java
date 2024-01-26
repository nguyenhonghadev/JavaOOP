import java.util.Scanner;

/**
 * Slide35_Chuong2
 */
public class Slide35_Chuong2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a : ");
        int a = scanner.nextInt(); 
        System.out.print("Nhap so B : ");
        int b = scanner.nextInt(); 

        if (a < b) {
            System.out.println("So be nhat trong 2 so la " + a);
        } else {
            System.out.println("So be nhat trong 2 so la " + b);
        }
    }
}
