package Buoi_4;

import java.util.Scanner;

public class B2 {
    /**
     * Cho người dùng nhập vào 3 số nguyên,
     * viết chương trình xuất 3 số theo thứ tự tăng dần
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên thứ 1: ");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên thứ 2: ");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số nguyên thứ 3: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Thứ tự tăng dần: " + a + " " + b + " " + c);
    }
}
