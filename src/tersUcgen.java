import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak;

        System.out.print("Üçgenin basamak sayısını giriniz : ");
        basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            System.out.println();
            for (int k = i*2-1; k > 0; k--) {
                System.out.print("*");
            }
        }
    }
}
