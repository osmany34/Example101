package Week1;
import java.util.Scanner;
public class MinMaxDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();

        int max, min;

        // İlk sayıyı alarak hem en büyük hem de en küçük sayı olarak atıyoruz
        System.out.print("1. Sayıyı giriniz : ");
        int sayi = input.nextInt();
        max = sayi;
        min = sayi;

        // Diğer sayıları kontrol ederek en büyük ve en küçük sayıları buluyoruz
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("**********");
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
