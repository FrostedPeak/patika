import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsizTutar,kdvliTutar,kdvOrani,kdvMiktari;
        System.out.print("Para miktarını giriniz : ");
        kdvsizTutar = input.nextDouble();
        kdvOrani = kdvsizTutar > 1000 ? 0.08 : 0.18;
        kdvMiktari = kdvsizTutar * kdvOrani;
        kdvliTutar = kdvsizTutar + kdvMiktari;
        String bilgi = kdvOrani == 0.08 ? "Girdiğiniz para miktarı 1000'den büyük olduğu için KDV oranınız %8 olarak alınacaktır." : "Girdiğiniz para miktarı 1000'den küçük olduğu için KDV oranınız %18 olarak alınacaktır.";
        System.out.println(bilgi);
        System.out.println("KDV'siz Fiyat : " + kdvsizTutar);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.print("KDV Tutarı : " + kdvMiktari);
    }
}
