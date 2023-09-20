import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner girdi = new Scanner(System.in);

        System.out.println("İlk kenarın uzunluğunu giriniz: ");
        a = girdi.nextInt();

        System.out.println("İkinci kenarın uzunluğunu giriniz: ");
        b = girdi.nextInt();

        c = (a * a) + (b * b);
        System.out.println("Hipotenüs: " + Math.sqrt(c));

    }
}