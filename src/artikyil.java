import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int artikyil;

        System.out.print("Yıl giriniz : ");
        artikyil = input.nextInt();

        if (artikyil%100 == 0) {
            if (artikyil%400 == 0) {
                System.out.println(artikyil + " bir artık yıldır.");
            } else {
                System.out.println(artikyil + " bir artık yıl değildir.");
            }
        } else if (artikyil%4 == 0) {
            System.out.println(artikyil + " bir artık yıldır.");
        } else {
            System.out.println(artikyil + " bir artık yıl değildir.");
        }
    }
}
