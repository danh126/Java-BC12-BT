package Buoi_3.bt;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD_TO_VND_RATE  = 23500;

        System.out.println("Chương trình chuyển từ USD sang VNĐ");
        System.out.println("Nhập USD: ");

        double usd = scanner.nextDouble();
        long vnd = Math.round(usd * USD_TO_VND_RATE);

        System.out.println("Kết quả: " + usd + " USD = " + vnd + " VNĐ");
    }
}
