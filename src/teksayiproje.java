import java.util.Scanner;

public class teksayiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println("4'ün katları : " + i);
        }
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println("5'in katları : " + i);
        }
    }
}
