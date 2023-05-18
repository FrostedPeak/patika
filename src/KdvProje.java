import java.util.Scanner;

public class KdvProje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsizTutar,kdvliTutar,kdvOranı,kdvMiktarı;
        System.out.print("Para miktarını giriniz : ");
        kdvsizTutar = input.nextDouble();
        kdvOranı = kdvsizTutar > 1000 ? 0.08 : 0.18;
        kdvMiktarı = kdvsizTutar * kdvOranı;
        kdvliTutar = kdvsizTutar + kdvMiktarı;
        String bilgi = kdvOranı == 0.08 ? "Girdiğiniz para miktarı 1000'den büyük olduğu için KDV oranınız %8 olarak alınacaktır." : "Girdiğiniz para miktarı 1000'den küçük olduğu için KDV oranınız %18 olarak alınacaktır.";
        System.out.println(bilgi);
        System.out.println("KDV'siz Fiyat : " + kdvsizTutar);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.print("KDV Tutarı : " + kdvMiktarı);
    }
}
