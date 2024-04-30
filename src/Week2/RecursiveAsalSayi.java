package Week2;

import java.util.Scanner;

public class RecursiveAsalSayi {

    // Recursive olarak bir sayının asal olup olmadığını kontrol eden metot
    static boolean isAsal (int sayi,int bolen){
        if (sayi <= 2){
            return (sayi == 2);
        }
        if (sayi % bolen == 0){
            return false;
        }
        if (bolen * bolen > sayi){
            return true;
        }
        return isAsal(sayi,bolen + 1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Sayı Giriniz : ");
            int sayi = input.nextInt();

            // Alınan sayının asal olup olmadığını kontrol etme
            if (sayi <= 1){
                System.out.println(sayi + " ASAL SAYI DEĞİLDİR !!");
            }else {
                boolean asal = isAsal(sayi,2);
                if (asal){
                    System.out.println(sayi + " ASAL SAYIDIR !");
                }else {
                    System.out.println(sayi + " ASAL SAYI DEĞİLDİR !!");
                }
            }
        }
    }
}
