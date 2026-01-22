package Buoi_3.bt;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chương trình tính và xuất tổng 2 ký số của n");

        System.out.println("Nhập vào n (số nguyên dương với 2 ký số): ");
        int n = scanner.nextInt();

        if(n < 10 || n > 99){
            System.out.println("n phải là số nguyên dương với 2 ký số!");
            return;
        }

        int hangChuc = n / 10;
        int hangDonVi = n % 10;
        int tong = hangChuc + hangDonVi;

        System.out.println("Tồng 2 ký số của n là: " + tong);
    }
}
