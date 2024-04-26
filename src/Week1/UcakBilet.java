package Week1;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- X Havayolarına Hoş Geldiniz --");
        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alınması
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Verilerin kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Normal ücret hesaplama
        double normalTutar = mesafe * 0.10;

        // Yaş indirimi hesaplama
        double yasIndirimi = 0;
        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = normalTutar * 0.10;
        } else if (yas >= 65) {
            yasIndirimi = normalTutar * 0.30;
        }

        // İndirimli tutar hesaplama
        double indirimliTutar = normalTutar - yasIndirimi;

        // Yolculuk tipine göre indirim hesaplama
        if (yolculukTipi == 2) {
            indirimliTutar *= 0.80; // %20 indirim
        }

        // Toplam tutar hesaplama
        double toplamTutar = (yolculukTipi == 2) ? indirimliTutar * 2 : indirimliTutar;

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        System.out.println("İyi Yolculuklar Dileriz :) ");
    }
}
