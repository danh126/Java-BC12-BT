package Buoi_5.hinh_2;

public class B3 {
    /**
     * Có bao nhiêu số chia hết cho 3 từ 0-1000
     */
    public static void main(String[] args) {
        int i = 0;
        int count = 0;

        while (i <= 1000){
            if(i % 3 == 0){
                count++;
            }
            i++;
        }

        System.out.println("Số lượng các số chia hết cho 3 từ 0 đến 1000 là: " + count);
    }
}
