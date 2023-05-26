import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        while (true){
            System.out.print("Bir sayı giriniz : ");
            sayi = input.nextInt();
            int toplam = 0;
            for (int i = sayi-1; i > 0; i--) {
                if (sayi%i == 0) {
                    toplam += i;
                }
            }
            if (sayi == toplam) {
                System.out.println("Sayınız MÜKEMMEL bir sayıdır.");
            } else {
                System.out.println("Sayınız mükemmel bir sayı değildir");
            }
        }
    }
}
