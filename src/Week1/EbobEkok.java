package Week1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        int number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int number2 = input.nextInt();

        // EBOB hesaplama
        int ebob = 1;
        int i = 1;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama
        int ekok = (number1 * number2) / ebob;

        // Sonuç
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
