package Week2;

import java.util.Scanner;

public class RecursiveDesign {

    // Recursive olarak işlem yapılacak metot
    static void process(int n, int limit) {
        System.out.print(n + " ");

        // Eğer mevcut sayı limit değerine eşit veya daha küçükse, işlemi sonlandır
        if (n <= limit) {
            return;
        }

        // Mevcut sayıyı 5'er azaltarak recursive olarak işlemi tekrar et
        process(n - 5, limit);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n değerini al
        System.out.print("N Sayısı : ");
        int n = input.nextInt();

        // Limit değeri 0 olarak ayarlandı
        process(n, 0);
    }
}
