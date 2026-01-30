package Buoi_5.hinh_2;

import java.util.Scanner;

public class B2 {
    /**
     * Tính tổng các số chẵn từ 1 đến n.
     * Với n nhập từ người dùng
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n phải là số nguyên dương!");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("Tồng số chẵn từ 1 đến " + n + " là: " + sum);
    }
}
