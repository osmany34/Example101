package Week2;

import java.util.Arrays;

public class ArrayElementsFrekans {
    public static void main(String[] args) {
        int[] dizi = {30, 25, 26, 30, 25, 20, 5, 25};

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");

        // Dizideki her bir elemanın frekansını saklayacak bir array oluştur
        int[] frekanslar = new int[dizi.length];

        // Elemanların frekanslarını hesapla
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            // Dizideki her bir elemanın frekansını kontrol et
            if (frekanslar[i] == -1) {
                // Daha önce işlenen bir eleman ise geç
                continue;
            }
            int frekans = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == sayi) {
                    // Eğer eleman tekrar ediyorsa, frekansı artır ve işlenmiş olarak işaretle
                    frekans++;
                    frekanslar[j] = -1;
                }
            }
            // Frekansı ekrana yazar
            System.out.println(sayi + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
