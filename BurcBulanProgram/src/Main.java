import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ay, gun;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı sayısal olarak giriniz: ");
        ay = input.nextInt();
        if (ay < 0 || ay > 12) {
            System.out.print("Hatalı bir giriş yaptınız, tekrar giriniz: ");
            ay = input.nextInt();
        }
        System.out.print("Doğduğunuz günü sayısal olarak giriniz: ");
        gun = input.nextInt();
        if (gun < 0 || gun > 31) {
            System.out.print("Hatalı bir giriş yaptınız, tekrar giriniz: ");
            gun = input.nextInt();
        }

        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Oğlak burcusunuz!");
            } else if (gun > 21 && gun < 32) {
                System.out.println("Kova burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("Kova burcusunuz!");
            } else if (gun > 19 && gun < 30) {
                System.out.println("Balık burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Balık burcusunuz!");
            } else if (gun > 20 && gun < 32) {
                System.out.println("Koç burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Koç burcusunuz!");
            } else if (gun > 20 && gun < 31) {
                System.out.println("Boğa burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Boğa burcusunuz!");
            } else if (gun > 21 && gun < 32) {
                System.out.println("İkizler burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("İkizler burcusunuz!");
            } else if (gun > 22 && gun < 31) {
                System.out.println("Yengeç burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Yengeç burcusunuz!");
            } else if (gun > 22 && gun < 32) {
                System.out.println("Aslan burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Aslan burcusunuz!");
            } else if (gun > 22 && gun < 32) {
                System.out.println("Başak burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Başak burcusunuz!");
            } else if (gun > 22 && gun < 31) {
                System.out.println("Terazi burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Terazi burcusunuz!");
            } else if (gun > 22 && gun < 32) {
                System.out.println("Akrep burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Akrep burcusunuz!");
            } else if (gun > 21 && gun < 31) {
                System.out.println("Yay burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Yay burcusunuz!");
            } else if (gun > 21 && gun < 32) {
                System.out.println("Oğlak burcusunuz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
            }
        } else {
            System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz!");
        }


    }
}