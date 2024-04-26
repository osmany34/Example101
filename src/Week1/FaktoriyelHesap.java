package Week1;
import java.util.Scanner;

public class FaktoriyelHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini al
        System.out.print("n değerini giriniz : ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz : ");
        int r = input.nextInt();

        // n'in faktöriyelini hesapla
        int nFaktoriyel = 1;
        int i = 1;
        while (i <= n) {
            nFaktoriyel *= i;
            i++;
        }

        // r'nin faktöriyelini hesapla
        int rFaktoriyel = 1;
        i = 1;
        while (i <= r) {
            rFaktoriyel *= i;
            i++;
        }

        // (n - r)'nin faktöriyelini hesapla
        int eksiFaktoriyel = 1;
        i = 1;
        while (i <= n - r) {
            eksiFaktoriyel *= i;
            i++;
        }

        // Kombinasyonu hesapla
        int kombinasyon = nFaktoriyel / (rFaktoriyel * eksiFaktoriyel);

        // Sonucu ekrana yazdır
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}
