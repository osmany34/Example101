package Week1;

import java.util.Scanner;

public class VucutEndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        // Vücut kitle index hesaplama
        double index = kilo / (boy * boy);

        System.out.println("Vücut kitle indexsiniz : " + index);

    }
}
