import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,c,fakn = 1,fakr = 1,faknr = 1;
        System.out.print("Kümenizin eleman sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("Grupların eleman sayısını giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fakn *= i;
        }
        for (int i = 1; i <= r; i++) {
            fakr *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            faknr *= i;
        }
        c = fakn/(fakr*faknr);
        System.out.println("Bu küme ve grup eleman sayıları ile çıkan kombinasyon : " + c);
    }
}
