import java.util.Scanner;

public class manavproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,toplam;
        System.out.print("Armut kaç kilogram satın alındı? : ");
        armut = input.nextDouble();
        System.out.print("ELma kaç kilogram satın alındı? : ");
        elma = input.nextDouble();
        System.out.print("Domates kaç kilogram satın alındı? : ");
        domates = input.nextDouble();
        System.out.print("Muz kaç kilogram satın alındı? : ");
        muz = input.nextDouble();
        System.out.print("Patlican kaç kilogram satın alındı? : ");
        patlican = input.nextDouble();
        toplam = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5.00;
        System.out.println("Toplam ödemeniz gereken miktar : " + toplam);
    }
}
