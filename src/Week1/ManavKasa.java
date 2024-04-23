package Week1;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        //Ürünlerin fiyatları
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat =5.00;

        // Alışveriş miktarları
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        double armutKilo = inp.nextDouble();
        double tutar1 = (armutFiyat*armutKilo);

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = inp.nextDouble();
        double tutar2 = (elmaFiyat*elmaKilo);

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = inp.nextDouble();
        double tutar3 = (domatesFiyat*domatesKilo);

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = inp.nextDouble();
        double tutar4 = (muzFiyat*muzKilo);

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = inp.nextDouble();
        double tutar5 = (patlicanFiyat*patlicanKilo);

        // Toplam tutarın hesaplanması
        double toplamTutar = tutar1 + tutar2 + tutar3 + tutar4 + tutar5;

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
