package Week1;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan dairenin yarıçapının alınması
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        // Kullanıcıdan merkez açısının ölçüsünün alınması
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        double alpha =inp.nextDouble();

        //Daire diliminin alanı hesaplanması
        double alan = (pi * (r * r) * alpha) / 360;
        System.out.println("Daire diliminin alanı : " + alan);

    }
}
