package Buoi_4;

import java.util.Scanner;

public class B4 {
    /**
     * Viết chương trình cho phép nhập vao số nguyên có hai chữ số.
     * Hãy in ra cách đọc của số nguyên này.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên có hai chữ số: ");
        int n = scanner.nextInt();

        // Kiểm tra đúng hai chữ số
        if((n < 10 && n > -10) || n > 99 || n < -99){
            System.out.println("Số nguyên không hợp lệ!");
            return;
        }

        // Xử lý số âm
        if(n < 0){
            System.out.println("âm ");
        }

        int abs = Math.abs(n);
        int tens = abs / 10;
        int units = abs % 10;

        // Đoc hàng chục
        switch (tens){
            case 1:
                System.out.println("mười");
                break;
            case 2:
                System.out.println("hai mươi");
                break;
            case 3:
                System.out.println("ba mươi");
                break;
            case 4:
                System.out.println("bốn mươi");
                break;
            case 5:
                System.out.println("năm mươi");
                break;
            case 6:
                System.out.println("sáu mươi");
                break;
            case 7:
                System.out.println("bảy mươi");
                break;
            case 8:
                System.out.println("tám mươi");
                break;
            case 9:
                System.out.println("chín mươi");
                break;
        }

        // Đọc hàng đơn vị
        if(units != 0){
            if(units == 1 && tens > 1){
                System.out.println("mốt");
            } else if (units == 5) {
                System.out.println("lăm");
            }else {
                switch (units){
                    case 1:
                        System.out.println("một");
                        break;
                    case 2:
                        System.out.println("hai");
                        break;
                    case 3:
                        System.out.println("ba");
                        break;
                    case 4:
                        System.out.println("bốn");
                        break;
                    case 6:
                        System.out.println("sáu");
                        break;
                    case 7:
                        System.out.println("bảy");
                        break;
                    case 8:
                        System.out.println("tám");
                        break;
                    case 9:
                        System.out.println("chín");
                        break;
                }
            }
        }
    }
}
