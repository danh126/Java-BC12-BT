package Buoi_3.bt;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int X = 8;

        System.out.println("Chương trình tính P(x) = a * x^n với x = 8");

        System.out.println("Nhập vào a (số thực): ");
        double a = scanner.nextDouble();

        System.out.println("Nhập n (số nguyên không âm): ");
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("n phải lớn hơn hoặc bằng 0!!!");
            return;
        }

        double result = a * Math.pow(X, n);
        System.out.println("P(8) = " + result);
    }
}
