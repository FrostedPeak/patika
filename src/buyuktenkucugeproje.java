import java.util.Scanner;

public class buyuktenkucugeproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("Birinci sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
                return;
            } else if (c < b) {
                System.out.print("a<c<b");
                return;
            }
        } else {
            System.out.println("Eşit olan sayılar var.");
            return;
        }

        if (b < a && b < c) {
            if (a < c) {
                System.out.println("b<a<c");
                return;
            } else if (c < a) {
                System.out.print("b<c<a");
                return;
            }
        } else {
            System.out.println("Eşit olan sayılar var.");
            return;
        }

        if (c < a && c < b) {
            if (a < b) {
                System.out.println("c<a<b");
                return;
            } else if (b < a) {
                System.out.print("c<b<a");
                return;
            }
        } else {
            System.out.println("Eşit olan sayılar var.");
            return;
        }
    }
}
