import java.util.Scanner;

public class basamaktoplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, basamak, toplam = 0;

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        while (sayi > 0) {
            basamak = sayi%10;
            toplam += basamak;
            System.out.println("Toplam şuan : " + toplam);
            sayi /= 10;
        }
        System.out.print("Sayınızın basamaklarının toplamı : " + toplam);
    }
}
