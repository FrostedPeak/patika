import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, A = 0, B = 1, C;
        System.out.print("Enter the number : ");
        number = input.nextInt();
        for (int i = number; i > 0; i--) {
            System.out.println((number-i+1) + ". fibonacci sayısı : " + A);
            C = B;
            B = A + B;
            A = C;
        }
    }
}