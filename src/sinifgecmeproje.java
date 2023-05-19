import java.util.Scanner;

public class sinifgecmeproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, turkce, kimya, muzik, average,toplamNot = 0;
        int gecerliNotSayisi = 0;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextDouble();
        if (!(0<=mat && mat<=100)) {
            System.out.println("Geçersiz bir not girdiniz.");
        } else {
            toplamNot += mat;
            gecerliNotSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextDouble();
        if (!(0<=fizik && fizik<=100)) {
            System.out.println("Geçersiz bir not girdiniz.");
        } else {
            toplamNot += fizik;
            gecerliNotSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextDouble();
        if (!(0<=turkce && turkce<=100)) {
            System.out.println("Geçersiz bir not girdiniz.");
        } else {
            toplamNot += turkce;
            gecerliNotSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextDouble();
        if (!(0<=kimya && kimya<=100)) {
            System.out.println("Geçersiz bir not girdiniz.");
        } else {
            toplamNot += kimya;
            gecerliNotSayisi++;
        }

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextDouble();
        if (!(0<=muzik && muzik<=100)) {
            System.out.println("Geçersiz bir not girdiniz.");
        } else {
            toplamNot += muzik;
            gecerliNotSayisi++;
        }

        average = toplamNot / gecerliNotSayisi;

        switch (gecerliNotSayisi) {
            case 0:
                System.out.println("Her şey yanlış.");
                break;
            case 1:
                System.out.println("Sadece bir dersi doğru girdiğin için ortalama alınamamıştır");
                System.out.println("Notun : " + average);
                break;
            case 2:
                System.out.println("Doğru girdiğin 2 dersin ortalaması alınmıştır.");
                System.out.println("Ortalamanız : " + average);
                break;
            case 3:
                System.out.println("Doğru girdiğin 3 dersin ortalaması alınmıştır.");
                System.out.println("Ortalamanız : " + average);
                break;
            case 4:
                System.out.println("Doğru girdiğin 4 dersin ortalaması alınmıştır.");
                System.out.println("Ortalamanız : " + average);
                break;
            case 5:
                System.out.println("Ortalamanız : " + average);
                break;
        }
    }
}
