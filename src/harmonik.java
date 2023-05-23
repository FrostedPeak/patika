import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double toplam = 0;

        System.out.print("Harmonik serisinin alınmasını istediğiniz sayıyı giriniz : ");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++) {
            toplam += (1/i);
        }
        System.out.print("Harmonik serinizin sonucu : " + toplam);
    }
}
