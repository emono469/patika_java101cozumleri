import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domat = 1.11, muz = 0.95, pat = 5.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kilosunu Giriniz: ");
        double armutKilo = sc.nextDouble();
        System.out.print("Elma Kilosunu Giriniz: ");
        double elmaKilo = sc.nextDouble();
        System.out.print("Domates Kilosunu Giriniz: ");
        double domatKilo = sc.nextDouble();
        System.out.print("Muz Kilosunu Giriniz: ");
        double muzKilo = sc.nextDouble();
        System.out.print("Patlıcan Kilosunu Giriniz: ");
        double patKilo = sc.nextDouble();

        double toplam = armut * armutKilo + elma * elmaKilo + domat * domatKilo + muz * muzKilo + pat * patKilo;
        System.out.println("Toplam Tutar: " + toplam + " TL");

    }
}