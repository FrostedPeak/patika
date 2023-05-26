import java.util.Scanner;

public class biggestSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,count,bn = 0,sn = 0;
        System.out.print("Kaç numara gireceğinizi yazınız : ");
        count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayınızı giriniz : ");
            number = input.nextInt();
            if (number > bn) {
                bn = number;
            }
            if (number < sn) {
                sn = number;
            }
        }
        System.out.println("En büyük numaranız : " + bn + "\nEn küçük numaranız : " + sn);
    }
}
