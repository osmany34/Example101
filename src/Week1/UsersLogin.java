package Week1;

import java.util.Scanner;

public class UsersLogin {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        //Stringlerde eşitlik durumu equals ile

        // Kullanıcı adı ve şifre doğruysa
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else if (userName.equals("patika")) {
            // Kullanıcı adı doğruysa şifre yanlışsa
            System.out.println("Şifreniz Yanlış !");

            // Şifreyi sıfırlamak isteyip istemediğini soran kod
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String resetPassword = input.nextLine();

            //equalsIgnoreCase büyük-küçük harf ayrımı için
            if (resetPassword.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifreniz: ");
                String newPassword = input.nextLine();

                // Yeni şifrenin, eski şifre ile aynı olmadığını kontrol eden kod
                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu !");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        } else if (password.equals("java123")) {
            // Şifre doğruysa kullanıcı adı yanlışsa
            System.out.println("Kullanıcı Adınız Yanlış !");
        } else {
            // Kullanıcı adı ve şifre yanlışsa
            System.out.println("Kullanıcı Adınız ve Şifreniz Yanlış !");
        }
    }
}
