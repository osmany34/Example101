package Week1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz : ");
        int n = input.nextInt();

        // Her satırda yıldız sayısını azaltarak ters üçgen oluşur
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
