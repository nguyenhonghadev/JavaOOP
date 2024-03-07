import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang : ");
        int n = input.nextInt();
        double sum = 0;
        int[] array = new int[n];
        for(int i = 0;i < array.length;i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " : ");
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.printf( "TB cong cua mang la %.3f",((double) sum/n));
    }
}