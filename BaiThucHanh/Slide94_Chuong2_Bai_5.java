import java.util.Scanner;

public class Slide94_Chuong2_Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String equation = "";

        while (sum <= 100) {
            System.out.print("Nhập vào số tự nhiên n: ");
            int n = scanner.nextInt();
            equation += (equation.isEmpty() ? "" : " + ") + n;
            sum += n;

            if (sum > 100) {
                 System.out.println("Tổng: "+ equation +" = "+ sum);
            }

        }

       

        scanner.close();
    }
}
