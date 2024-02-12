import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, islem, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1: Toplama");
        System.out.println("2: Çıkarma");
        System.out.println("3: Çarpma");
        System.out.println("4: Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");

        islem = input.nextInt();

        switch (islem) {

            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;

            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;

            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
                break;

            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println(sonuc);
                } else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;

            default:
                System.out.println("Yanlış bir seçim yaptınız, tekrar deneyiniz!");
        }


    }
}