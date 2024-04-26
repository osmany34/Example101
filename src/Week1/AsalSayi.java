package Week1;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar : ");

        // 2'den başlayarak 100'e kadar olan her bir sayı için asal olup olmadığını kontrol etme
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;

            // 2'den başlayarak sayıyı kendisine kadar olan tüm sayılarla bölünüp bölünmediğini kontrol etme
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false; // Eğer sayı bir sayıya bölünüyorsa, asal değildir
                    break; // Döngüden çık
                }
            }

            // Eğer sayı asalsa ekrana yazdır
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}