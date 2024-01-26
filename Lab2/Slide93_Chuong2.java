import java.util.Scanner;

public class Slide93_Chuong2 {
    public static void main(String[] args) {
        int Age, Year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten cua ban: ");
        String Name = scanner.nextLine();

        System.out.print("Nhap nam sinh cua ban: ");
        Year = scanner.nextInt();
        Age = 2024 - Year;

        if (Age < 16) {
            System.out.println("Ban " + Name + " o do tuoi vi thanh nien");
        } else if (Age >= 16 && Age < 18) {
            System.out.println("Ban " + Name + " o do tuoi truong thanh");
        } else if (Age >= 18) {
            System.out.println("Ban " + Name + " o do tuoi da gia");
        }

        scanner.close();
    }
}
