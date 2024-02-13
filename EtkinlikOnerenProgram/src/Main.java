import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.println("Etkinlik Öneren Programa Hoşgeldiniz...");
        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yap!");
        } else if (sicaklik >= 5 && sicaklik <= 9) {
            System.out.println("Sinemaya git!");
        } else if (sicaklik >= 10 && sicaklik <= 15) {
            System.out.println("Sinemaya ve/veya pikniğe git!");
        } else if (sicaklik >= 16 && sicaklik <= 25) {
            System.out.println("Pikniğe git!");
        } else {
            System.out.println("Yüzmeye git!");
        }


    }
}