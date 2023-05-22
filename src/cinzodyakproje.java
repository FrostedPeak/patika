import java.util.Scanner;

public class cinzodyakproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumyili;
        System.out.print("Doğduğunuz yılı giriniz : ");
        dogumyili = input.nextInt();

        switch (dogumyili%12) {
            case 0:
                System.out.print("Çin zodyağı burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin zodyağı burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin zodyağı burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin zodyağı burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin zodyağı burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin zodyağı burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin zodyağı burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin zodyağı burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin zodyağı burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin zodyağı burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin zodyağı burcunuz : At");
                break;
            case 11:
                System.out.print("Çin zodyağı burcunuz : Koyun");
                break;
        }

    }
}
