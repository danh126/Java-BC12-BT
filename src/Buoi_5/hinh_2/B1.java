package Buoi_5.hinh_2;

public class B1 {
    /**
     * In tất cả số nguyên dương lẻ/chẵn nhỏ hơn 100.
     * Dùng bước nhảy và dùng % 2
     */
    public static void main(String[] args) {
        // In số nguyên dương chẵn dùng for
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                System.out.println("Số chẵn: " + i);
            }
        }

        // In số nguyên dương lẻ dùng while
        int n = 0;
        while (n < 100){
            if(n % 2 != 0){
                System.out.println("Số lẻ: " + n);
            }
            n++;
        }
    }
}
