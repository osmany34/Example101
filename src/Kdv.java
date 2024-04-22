import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");

        tutar = input.nextDouble();
        kdvTutar =tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        // KDV oranı belirleme
        if (tutar <= 1000) {
            // Tutar 1000 TL veya daha azsa %18 KDV
            kdvOran = 0.18;
        } else {
            // Tutar 1000 TL'den büyükse %8 KDV
            kdvOran = 0.08;
        }

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutarı :" + kdvliTutar);


    }
}
