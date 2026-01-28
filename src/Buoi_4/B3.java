package Buoi_4;

import java.util.Scanner;

public class B3 {
    /**
     * Cũng yêu cầu như câu 2, nhưng cho phép hỏi người dùng muốn xuất theo thứ tự nào,
     * nếu người dùng chọn 1 thì xuất tăng dần, người dùng chọn 2 thì xuất giảm dần
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên thứ 1: ");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên thứ 2: ");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số nguyên thứ 3: ");
        int c = scanner.nextInt();

        System.out.println("Chọn các lựa chọn sau: ");
        System.out.println("(1) Xuất tăng dần \n(2) Xuất giảm dần ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
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
                break;
            case 2:
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }

                if (a < c) {
                    int temp = a;
                    a = c;
                    c = temp;
                }

                if (b < c) {
                    int temp = b;
                    b = c;
                    c = temp;
                }

                System.out.println("Thứ tự giảm dần: " + a + " " + b + " " + c);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
