import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        // Toplamı tutmak için bir değişken oluştur
        int toplam = 0;

        // Sayının basamaklarını toplama ekle
        int tempSayi = sayi;
        while (tempSayi != 0) {
            // Sayının son basamağını al ve toplama ekle
            int basamak = tempSayi % 10;
            toplam += basamak;
            // Son basamağı çıkartarak sayıyı küçült
            tempSayi /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + toplam);
    }
}
