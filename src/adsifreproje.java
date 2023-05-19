import java.util.Scanner;

public class adsifreproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ad,gad;
        int sifre,gsifre,secim,yenisifre;

        ad = "abc";
        sifre = 123;

        System.out.print("Kullanıcı adını giriniz : ");
        gad = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        gsifre = input.nextInt();

        if ((ad.equals(gad)) && (gsifre == sifre)) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        } else if (ad.equals(gad)) {
            System.out.println("Girdiğiniz şifre yanlış.");
            System.out.print("Şifrenizi değiştirmek ister misiniz?\n1-Evet 2-Hayır\nLütfen numara ile seçiminizi belirtiniz : ");
            secim = input.nextInt();
            if (!(secim == 1 || secim == 2)) {
                System.out.println("Girdiğiniz numara için bir seçim yoktur.");
            } else {
                if (secim == 1) {
                    System.out.print("Yeni şifrenizi giriniz : ");
                    yenisifre = input.nextInt();
                    if (yenisifre == gsifre || yenisifre == sifre) {
                        System.out.println("Yeni şifreniz yanlış girdiğiniz veya eski şifreniz ile aynı olamaz.");
                    } else {
                        System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir.");
                    }
                } else if (secim == 2) {
                    System.out.println("Şifreniz aynı kalacaktır.");
                }
            }
        } else {
            System.out.print("Girdiğiniz kullanıcı adı için bir hesap sisteme kayıtlı değildir.");
        }
    }
}
