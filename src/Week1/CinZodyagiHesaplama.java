package Week1;
import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcının doğum yılını sorar
        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = input.nextInt();

        String hayvan = "";

        // Doğum yılının 12 ile bölümünden kalanına göre Çin zodyağı hayvanını belirler
        switch (dogumYili % 12) {
            case 0:
                hayvan = "Maymun";
                break;
            case 1:
                hayvan = "Horoz";
                break;
            case 2:
                hayvan = "Köpek";
                break;
            case 3:
                hayvan = "Domuz";
                break;
            case 4:
                hayvan = "Sıçan";
                break;
            case 5:
                hayvan = "Öküz";
                break;
            case 6:
                hayvan = "Kaplan";
                break;
            case 7:
                hayvan = "Tavşan";
                break;
            case 8:
                hayvan = "Ejderha";
                break;
            case 9:
                hayvan = "Yılan";
                break;
            case 10:
                hayvan = "At";
                break;
            case 11:
                hayvan = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : " + hayvan);

    }
}
