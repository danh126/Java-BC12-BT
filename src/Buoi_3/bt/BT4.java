package Buoi_3.bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COUNT = 5;
        int sum = 0;

        System.out.println("Chương trình tính giá trị trung bình của 5 số");

        for (int i = 1; i <= COUNT; i++){
            System.out.print("Nhập số thứ " + i + ": ");
            int value = scanner.nextInt();
            sum += value;
        }

        double average = (double) sum / COUNT;
        System.out.println("Giá trị trung bình là: " + average);
    }
}
