package Buoi_3.bt;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chương trình chuyển từ độ C sang độ F");
        System.out.println("Nhập độ C: ");

        int celsius  = scanner.nextInt();
        double fahrenheit  = (celsius * 1.8) + 32;

        System.out.println("Nhiệt độ tương ứng (°F): " + fahrenheit);
    }
}
