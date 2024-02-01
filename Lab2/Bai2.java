import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri cho n : ");
        int n = scanner.nextInt();
        if(n%2==0) System.out.println("n la so chan");
        else System.out.println("n la so le");
        
    }
}