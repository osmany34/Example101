package Week1;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar : ");

        // 2'den başlayarak 100'e kadar olan her bir sayı için asal olup olmadığını kontrol etme
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false; // sayı bir sayıya bölünüyorsa, asal değildir
                    break;
                }
            }

            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}