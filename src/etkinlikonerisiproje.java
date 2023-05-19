import java.util.Scanner;

public class etkinlikonerisiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;

        System.out.print("Sıcaklığın derece cinsinden girişini yapınız : ");
        c = input.nextInt();

        if (c < -273) System.out.println("Lütfen geçerli bir sıcaklık giriniz.");

        if (-273 <= c && c < 5) {
            System.out.println("Kayağa gidebilirsiniz.");
        } else if (5 <= c && c < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (10 <= c && c <= 15) {
            System.out.println("Harika! Sinemaya veya pikniğe gidebilirsiniz.");
        } else if (15 < c && c <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (25 < c) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
