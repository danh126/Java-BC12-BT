package Buoi_4;

import java.util.Scanner;

public class B1 {
    /**
     * Viết chương trình nhập vào 2 số nguyên m, n.
     * Xác định và xuất số nguyên lớn nhất.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên m: ");
        int m = scanner.nextInt();

        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        if(m == n){
            System.out.println("Hai số nguyên bằng nhau!");
        }else {
            int max = Math.max(m, n);
            System.out.println("Số nguyên lớn nhất: " + max);
        }
    }
}
