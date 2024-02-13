import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secim;
        String username, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        username = input.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("admin") && password.equals("123456")) {

            System.out.println("Başarıyla giriş yaptınız!");
        } else if (username.equals("admin") && !password.equals("123456")) {

            System.out.println("Yanlış bir şifre girdiniz! Yeni bir şifre oluşturmak istiyor musunuz?\n1: Evet\n2: Hayır");

            secim = input.nextInt();
            input.nextLine();

            if (secim == 1) {
                System.out.println("Yeni şifreyi giriniz: ");
                password = input.nextLine();

                if (password.equals("123456")) {
                    System.out.println("Eski bir şifre girdiniz, lütfen yeni bir şifre giriniz: ");
                    password = input.nextLine();
                } else {
                    System.out.println("Şifreniz başarıyla yenilendi!");
                }
            } else if (secim == 2) {
                System.out.println("Tekrar giriş yapmayı deneyiniz!");
            } else {
                System.out.println("Hatalı bir giriş yaptınız!");
            }


        } else {
            System.out.println("Hatalı bir giriş yaptınız!");
        }


    }
}