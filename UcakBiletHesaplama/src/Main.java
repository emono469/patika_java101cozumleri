import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, tip;
        double toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        mesafe = input.nextInt();
        if (mesafe <= 0) {
            System.out.print("Hatalı veri girdiniz! Tekrar giriniz: ");
            mesafe = input.nextInt();
        }
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        if (yas <= 0) {
            System.out.print("Hatalı veri girdiniz! Tekrar giriniz: ");
            yas = input.nextInt();
        }
        System.out.print("(1 = Tek Yön, 2 = Çift Yön) Yolculuk tipini giriniz: ");
        tip = input.nextInt();
        if (tip != 1 && tip != 2) {
            System.out.print("Hatalı veri girdiniz! Tekrar giriniz: ");
            tip = input.nextInt();
        }

        toplam = mesafe * 0.10;
        if (yas < 12) {
            toplam = toplam * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            toplam = toplam * 0.90;
        } else if (yas > 65) {
            toplam = toplam * 0.30;
        }

        System.out.println(" ");

        if (tip == 2) {
            toplam = toplam * 0.80;
            System.out.println("Toplam Tutar= " + (toplam * 2) + " TL");
        } else {
            System.out.println("Toplam Tutar= " + toplam + " TL");
        }

    }
}