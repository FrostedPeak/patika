import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,nb,nk;
        System.out.print("Please enter the first number :  ");
        n1 = input.nextInt();
        System.out.print("Please enter the second number :  ");
        n2 = input.nextInt();
        if (n1-n2 > 0) {
            nb = n1;
            nk = n2;
        } else {
            nb = n2;
            nk = n1;
        }
        for (int i = nk; i >= 1; i--) {
            if (nk%i == 0) {
                if (nb%i == 0) {
                    System.out.println("EBOB : " + i);
                    break;
                }
            }
        }
        for (int i = nb; i <= nb*nk; i += nb) {
            if (i%nk == 0) {
                System.out.println("EKOK : " + i);
                break;
            }
        }
    }
}
