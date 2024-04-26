package Week1;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int secim = 3;
        int bakiye = 1500;
        int select;

        while (secim > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("X Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    input.nextLine(); // dummy input

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                            int miktar = input.nextInt();
                            bakiye += miktar;
                            System.out.println("Yeni Bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Yetersiz Bakiye !");
                            } else {
                                bakiye -= miktar;
                                System.out.println("Yeni Bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Güle Güle !");
                            break;
                        default:
                            System.out.println("Geçersiz işlem. Lütfen tekrar deneyiniz.");
                    }
                } while (select != 4);
                break;
            } else {
                secim--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (secim == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + secim);
                }
            }
        }
    }
}
