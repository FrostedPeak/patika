import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,sum = 1;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            sum *= a;
        }
        System.out.println(a + " sayısının " + b + ". kuvveti : " + sum);
    }
}
