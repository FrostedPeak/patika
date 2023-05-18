import java.util.Scanner;

public class taksimetreproje {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double mesafe,bucret,aucret;
        System.out.print("Ne kadar mesafe gidildiğini giriniz : ");
        mesafe = girdi.nextDouble();
        bucret = mesafe * 2.20;
        if ((bucret + 10) > 20) {
            aucret = bucret + 10;
        }
        else {
            aucret = 20;
        }
        System.out.print("Ödemeniz gereken fiyat : " + aucret);
    }
}
