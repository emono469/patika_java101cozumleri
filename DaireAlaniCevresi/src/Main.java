import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = sc.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println(" ");
        System.out.println("Dairenin Alanı: " + alan + " cm2");
        System.out.println("Dairenin Çevrei: " + cevre + " cm");

    }
}