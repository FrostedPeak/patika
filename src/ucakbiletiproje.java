import java.util.Scanner;

public class ucakbiletiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yas, km, ciftbilet;
        double tl = 0.10, fiyat;

        System.out.print("Bruh havayollarına hoş geldiniz.\nYaşınız : ");
        yas = input.nextInt();
        if (yas<0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        System.out.print("Seyahat edeceğiniz mesafe : ");
        km = input.nextInt();
        if (km<0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        System.out.print("Çift bilet almak ister misiniz?\n1-Evet 2-Hayır\nSeçiminiz : ");
        ciftbilet = input.nextInt();
        if (!(ciftbilet == 1 || ciftbilet == 2)) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        fiyat = km * tl;

        if (yas < 12) {
            fiyat = fiyat * 0.5;
        } else if (12 <= yas && yas <= 24) {
            fiyat = fiyat * 0.9;
        } else if (65 < yas) {
            fiyat = fiyat * 0.7;
        }

        if (ciftbilet == 1) {
            fiyat = fiyat * 0.8;
        }
        System.out.println("Ödemeniz gereken fiyat : " + fiyat);
    }
}
