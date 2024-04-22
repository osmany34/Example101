package Week1;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        // Değişkenler
        int a, b, c;
        double u, alan;

        // Kullanıcı verileri
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = girdi.nextInt();

        System.out.println("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        System.out.println("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        // Üçgen çevresi
        u = (a + b + c) / 2.0;

        // Üçgenin alanını hesaplama
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}
