package Buoi_4;

import java.util.Scanner;

public class XepLoaiSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập Họ & Tên: ");
        String fullname = scanner.nextLine();

        System.out.println("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();

        if(toan < 0 || toan > 10){
            System.out.println("Điểm Toán không hợp lệ!");
            return;
        }

        System.out.println("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();

        if(ly < 0 || ly > 10){
            System.out.println("Điểm Lý không hợp lệ!");
            return;
        }

        System.out.println("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();

        if(hoa < 0 || hoa > 10){
            System.out.println("Điểm Hóa không hợp lệ!");
            return;
        }

        double dtb = (toan + ly + hoa) / 3;

        if(dtb >= 8.5){
            System.out.println(fullname + " - Xếp loại Giỏi");
        } else if (dtb >= 6.5) {
            System.out.println(fullname + " - Xếp loại Khá");
        } else if (dtb >= 5) {
            System.out.println(fullname + " - Xếp loại Trung Bình");
        }else {
            System.out.println(fullname + " - Xếp loại Yếu");
        }
    }
}
