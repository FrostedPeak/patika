import java.util.Scanner;
public class hesapmakinesiproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,select;

        System.out.print("Birinci sayınızı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayınızı giriniz : ");
        n2 = input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nİşlem Numarası : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işleminizin sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminizin sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminizin sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme işleminizin sonucu : " + (n1 / n2));
                }
                else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçerli bir işlem numarası girmediniz.");
        }
    }
}
