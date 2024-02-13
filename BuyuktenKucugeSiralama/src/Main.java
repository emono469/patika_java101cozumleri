import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.print("B sayısını giriniz: ");
        b = input.nextInt();
        System.out.print("C sayısını giriniz: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Büyükten küçüğe sıralanış: A > B > C");
            } else {
                System.out.println("Büyükten küçüğe sıralanış: A > C > B");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Büyükten küçüğe sıralanış: B > A > C");
            } else {
                System.out.println("Büyükten küçüğe sıralanış: B > C > A");
            }
        } else {
            if (a > b) {
                System.out.println("Büyükten küçüğe sıralanış: C > A > B");
            } else {
                System.out.println("Büyükten küçüğe sıralanış: C > B > A");
            }
        }
    }
}