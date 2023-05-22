import java.util.Scanner;

public class ciftsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sum = 0;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i%3 == 0 || i%4 == 0) {
                sum += i;
            }
        }
        System.out.println(sum + "");
    }
}
