package Week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçiminiz : ");
        select =input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama İşlemi Sonucu : " + (n1+n2));
                break;
            case 2 :
                System.out.println("Çıkarma İŞlemi Sonucu : " + (n1-n2));
                break;
            case 3 :
                System.out.println("Çarpma İşlemi Sonucu : " + (n1*n2));
                break;
            case 4 :
                if (n2 !=0){
                    System.out.println("Bölme İşlemi Sonucu : " + (double) n1/n2);
                }else {
                    System.out.println("Hatalı İşlem ! ");
                }
                break;
            default:
                System.out.println("!!!!!! Geçersiz Seçim !!!!! ");

        }

    }
}
