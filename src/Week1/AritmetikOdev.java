package Week1;

import java.util.Scanner;

public class AritmetikOdev {
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            // Kullanıcıdan 3 sayı al
            System.out.print("İlk sayıyı girin: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı girin: ");
            int b = input.nextInt();
            System.out.print("Üçüncü sayıyı girin: ");
            int c = input.nextInt();

            // sonucu hesapla
            int sonuc = a + b * c - b;

            System.out.println("İşlem sonucu : " + sonuc);

        }
}
