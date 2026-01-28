package Buoi_4;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bạn là ai? ");
        System.out.println("Bố (B) \nMẹ (M) \nAnh trai (AT) \nEm gái (EG) ");

        String chon = scanner.nextLine();

        switch (chon){
            case "B":
                System.out.println("Chào bố");
                break;

            case "M":
                System.out.println("Chào mẹ");
                break;

            case "AT":
                System.out.println("Chào anh trai");
                break;

            case "EG":
                System.out.println("Chào em gái");
                break;

            default:
                System.out.println("Giá trị bạn chọn không hợp lệ!");
        }
    }
}
