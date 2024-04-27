package Week1;
import java.util.Scanner;

public class TypeDonusum {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner kullanımı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı ve bir ondalıklı sayı alınması
        System.out.print("Bir tam sayı giriniz : ");
        int tamSayi = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz : ");
        double ondalikliSayi = input.nextDouble();

        // Tip dönüşümleri ve sonuçların ekrana yazdırılması
        double tamSayiDouble = (double) tamSayi;
        int ondalikliSayiInt = (int) ondalikliSayi;

        System.out.println("Tam sayının double hali : " + tamSayiDouble);
        System.out.println("Ondalıklı sayının int hali : " + ondalikliSayiInt);

    }
}