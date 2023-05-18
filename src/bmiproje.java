import java.util.Scanner;

public class bmiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.print("Boyunuzu METRE cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu KİLOGRAM cinsinden giriniz : ");
        kilo = input.nextDouble();
        indeks = kilo/(Math.pow(boy,boy));
        System.out.print("Vücut kitle indeksiniz : " + indeks);
    }
}
