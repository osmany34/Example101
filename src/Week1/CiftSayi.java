package Week1;
import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {

        // Kullanıcıdan giriş al
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();

        // Değişkenler
        int toplam = 0; // Toplamı saklamak için
        int sayac = 0; // Kaç tane 3 ve 4'e tam bölünen sayı olduğunu saymak için
        int i = 0; // Sayac

        // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünenleri bul ve topla
        while (i <= sayi) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
            i++;
        }

        // Eğer hiç 3 ve 4'e tam bölünen sayı yoksa
        if (sayac == 0) {
            System.out.println("Girilen sayı aralığında 3 ve 4'e tam bölünen sayı yok.");
        } else {
            // Ortalamayı hesapla ve yazdır
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        }
    }
}
