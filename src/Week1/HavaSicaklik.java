package Week1;

import java.util.Scanner;

public class HavaSicaklik {
    public static void main(String[] args) {
        int hava ;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        hava = input.nextInt();

        //else if kullanmadan if türeterek diğer detayları oluşturdum.

        if (hava < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else {
            if (hava <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (hava >= 10 && hava <= 25) {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
            if (hava > 25) {
                System.out.println("Yüzmeye Gidebilirsiniz.");
            }
        }

    }

}
