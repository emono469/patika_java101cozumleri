import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kmUcreti = 2.20;
        double acilisUcreti = 10.0;
        double toplamUcret;
        System.out.print("Gidilen Mesafeyi (KM) Giriniz: ");
        double girilenMesafe = sc.nextDouble();

        if (girilenMesafe < 5) {

            toplamUcret = 20;
            System.out.println("Ödenecek Tutar: " + toplamUcret + " TL");

        } else {

            toplamUcret = acilisUcreti + (kmUcreti * girilenMesafe);
            System.out.println("Ödenecek Tutar: " + toplamUcret + " TL");

        }
    }
}