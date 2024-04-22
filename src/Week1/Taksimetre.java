package Week1;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        //Değişken tanımlama
        int km;
        double perKm = 2.20, total, startPrice = 10;

        // Kullanıcı verileri
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);









    }
}
