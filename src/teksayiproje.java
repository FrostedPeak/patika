import java.util.Scanner;

public class teksayiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = 0, sum = 0;
        while (sayi%2 == 0) {
            System.out.print("Bir sayi giriniz : ");
            sayi = input.nextInt();
            if (sayi%4 == 0) {
                sum += sayi;
            }
        }
        System.out.println("Toplam : " + sum);
    }
}
