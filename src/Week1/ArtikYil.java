package Week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan yıl bilgisi alma
        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        // Alınan yıla göre artık olup olmadığı hesaplanan döngü
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)){
            System.out.println(yil + " bir artık yıldır.");
        }else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
