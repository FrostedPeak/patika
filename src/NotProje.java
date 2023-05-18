import java.util.Scanner;

public class NotProje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f,ort;
        System.out.print("Matematik notunuzu giriniz : ");
        a = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz : ");
        b = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz : ");
        c = input.nextDouble();
        System.out.print("Türkçe notunuzu giriniz : ");
        d = input.nextDouble();
        System.out.print("Tarih notunuzu giriniz : ");
        e = input.nextDouble();
        System.out.print("Müzik notunuzu giriniz : ");
        f = input.nextDouble();

        ort = (a+b+c+d+f+e)/6;
        System.out.println("Derslerinizin not ortalaması : " + ort);
        String son = ort > 60 ? "Tebrikler, sınıftan geçtiniz." : "Üzgünüm, sınıfta kaldınız.";
        System.out.println(son);
    }
}
