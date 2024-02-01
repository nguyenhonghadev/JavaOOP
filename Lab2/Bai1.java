import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a,b;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri cho a: ");
        a = Scanner.nextDouble();
        System.out.print("Nhap gia tri cho b: ");
        b = Scanner.nextDouble();
        System.out.println(" a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("Phep chia du cua a va b = "+(a%b));
        if(a > b) System.out.println("a > b");
        else System.out.println("a < b");
        if(a == b) System.out.println("a = b");
        else System.out.println("a khac b");
    }
}