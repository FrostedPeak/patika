public class asalSayi {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean check = true;
            for (int j = i-1; j > 1; j--) {
                if (i%j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i + " sayısı asal bir sayıdır.");
            }
        }
    }
}