package Week1;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n sayısını al
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();

        // Harmonik sayıyı hesapla
        double result = 0.0;
        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);

    }
}
