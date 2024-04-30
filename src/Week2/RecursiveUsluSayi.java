package Week2;

import java.util.Scanner;

public class RecursiveUsluSayi {

    //recursive metodunu işleme
    static int usAlma(int taban, int us){
        if (us == 0){
            return 1;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban, us;

        //değerleri veren kod
        while (true){
            System.out.print("Taban değerini giriniz : ");
            taban = input.nextInt();

            System.out.print("Üs değerini giriniz : ");
            us = input.nextInt();

            //negatiflik durumu
            if (us < 0){
                System.out.println("Üs değeri negatif olamaz. Lütfen pozitif bir üs giriniz.");
            }else {
                break;
            }
        }
        //sonucu ekrana yazdırma
        int sonuc = usAlma(taban,us);
        System.out.println("Sonuç : " + sonuc);
    }
}
