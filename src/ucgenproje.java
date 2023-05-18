import java.util.Scanner;

public class ucgenproje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,u,alan;
        System.out.print("Üçgeninizin 1. kenarını girin : ");
        a = input.nextDouble();
        System.out.print("Üçgeninizin 2. kenarını girin : ");
        b = input.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Dik üçgeninizin hipotenüsünün uzunluğu : " + c);
        u = (a+b+c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Dik üçgeninizin alanı : " + alan);
        System.out.println("Dik üçgeninizin çevresinin uzunluğu : " + u*2);
    }
}
