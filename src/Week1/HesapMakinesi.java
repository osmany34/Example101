package Week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number_1, number_2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        number_1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        number_2 = input.nextInt();

        // Kullanıcıya hangi işlemleri seçebileceği mesaj
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçiminiz : ");
        select =input.nextInt();

        // Seçime göre switch-case yapısı
        switch (select){
            case 1:
                System.out.println("Toplama İşlemi Sonucu : " + (number_1 + number_2));
                break;
            case 2 :
                System.out.println("Çıkarma İşlemi Sonucu : " + (number_1 - number_2));
                break;
            case 3 :
                System.out.println("Çarpma İşlemi Sonucu : " + (number_1 * number_2));
                break;
            // Bölme işlemi (sıfıra bölme durumu)
            case 4 :
                if (number_1 !=0 && number_2 !=0){
                    System.out.println("Bölme İşlemi Sonucu : " + (double) number_1 / number_2);
                }else {
                    System.out.println("Hatalı İşlem ! ");
                }
                break;
            // 1 ve 4 arasında seçim almazsa
            default:
                System.out.println("!!!!!! Geçersiz Seçim !!!!! ");

        }

    }
}
