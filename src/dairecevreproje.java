import java.util.Scanner;

public class dairecevreproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,a,alan,cevre,mro,pi=3.14;
        System.out.print("Dairenizin yarıçapını giriniz : ");
        r = input.nextDouble();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenizin Alanı : " + alan);
        System.out.println("Dairenizin Çevresi : " + cevre);
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = input.nextDouble();
        mro = (pi *  r * r * a)/360;
        System.out.print("Dairenizin " + a + " açılı ölçüsünün alanı : " + mro);
    }
}
