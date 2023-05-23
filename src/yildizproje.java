import java.util.Scanner;

public class yildizproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,i,n;

        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        j = n-1;
        i = 1;

        while (j >= 0) {
            for (int k = j; k > 0; k--) {
                System.out.print(" ");
            }
            for (int t = i; t > 0; t--) {
                System.out.print("*");
            }
            i += 2;
            j--;
            System.out.println("");
        }
        while (j <= n) {
            for (int k = j; k > 0; k--) {
                System.out.print(" ");
            }
            for (int t = i; t > 0; t--) {
                System.out.print("*");
            }
            i -= 2;
            j++;
            System.out.println("");
        }
    }
}
