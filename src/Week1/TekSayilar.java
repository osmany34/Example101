package Week1;

import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int number;
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();

            // Girilen sayı çift ve 4'ün katı ise toplama ekliyoruz
            if (number % 2 == 0 && number % 4 == 0) {
                toplam += number;
            }

            // Girilen sayı tek ise döngüden çıkıyoruz
            if (number % 2 != 0) {
                break;
            }
        }while (number >= 0); // Girilen sayı negatif olmadığı sürece döngü devam edecek

        System.out.println("Çift ve 4'ün katı olan sayıların Toplamı: " + toplam);
    }

}
