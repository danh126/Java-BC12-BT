package Buoi_3.bt;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chương trình tính chiều dài cạnh huyền của một tam giác vuông khi biết 2 cạnh góc vuông!");

        System.out.println("Vui lòng nhập vào cạnh A:");
        double canhA = scanner.nextDouble();

        System.out.println("Vui lòng nhập vào cạnh B:");
        double canhB = scanner.nextDouble();

        double canhHuyen = Math.sqrt(canhA * canhA + canhB * canhB);

        System.out.println("Kết quả chiều dài cạnh huyền của một tam giác vuông là: " + canhHuyen);
    }
}
