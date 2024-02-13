import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik puanını giriniz: ");
        mat = input.nextInt();
        if (mat > 100 || mat < 0) {
            System.out.print("Yanlış bir giriş yaptınız, lütfen tekrar giriniz: ");
            mat = input.nextInt();
        }
        System.out.print("Fizik puanını giriniz: ");
        fiz = input.nextInt();
        if (fiz > 100 || fiz < 0) {
            System.out.print("Yanlış bir giriş yaptınız, lütfen tekrar giriniz: ");
            fiz = input.nextInt();
        }
        System.out.print("Türkçe puanını giriniz: ");
        tur = input.nextInt();
        if (tur > 100 || tur < 0) {
            System.out.print("Yanlış bir giriş yaptınız, lütfen tekrar giriniz: ");
            tur = input.nextInt();
        }
        System.out.print("Kimya puanını giriniz: ");
        kim = input.nextInt();
        if (kim > 100 || kim < 0) {
            System.out.print("Yanlış bir giriş yaptınız, lütfen tekrar giriniz: ");
            kim = input.nextInt();
        }
        System.out.print("Müzik puanını giriniz: ");
        muz = input.nextInt();
        if (muz > 100 || muz < 0) {
            System.out.print("Yanlış bir giriş yaptınız, lütfen tekrar giriniz: ");
            muz = input.nextInt();
        }

        double ortalama = (mat + fiz + tur + kim + muz) / 5;

        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfı geçemediniz!");
        }

        System.out.println("Ortalamanız: " + ortalama);


    }
}