package Week1;
import java.util.Scanner;
public class BurcProgram2 {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

        // Ay ve günü kontrol eederek burclar

        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if ((month == 1 && day >= 1 && day < 22) || (month == 12 && day >= 22 && day <= 31)) {
                burc = "Oğlak";
            } else if ((month == 1 && day >= 22 && day <= 31) || (month == 2 && day >= 1 && day < 20)) {
                burc = "Kova";
            } else if ((month == 2 && day >= 20 && day <= 28) || (month == 3 && day >= 1 && day < 21)) {
                burc = "Balık";
            } else if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day < 21)) {
                burc = "Koç";
            } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day >= 1 && day < 22)) {
                burc = "Boğa";
            } else if ((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day < 22)) {
                burc = "İkizler";
            } else if ((month == 6 && day >= 22 && day <= 30) || (month == 7 && day >= 1 && day < 23)) {
                burc = "Yengeç";
            } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day < 23)) {
                burc = "Aslan";
            } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day < 23)) {
                burc = "Başak";
            } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day < 23)) {
                burc = "Terazi";
            } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day < 22)) {
                burc = "Akrep";
            } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day < 22)) {
                burc = "Yay";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        // Sonucu yazdırma
        if (isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Merhaba : " + burc + " Burcusunuz");
        }
    }
}
