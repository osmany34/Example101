package Week1;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int a,b; // Kullanıcıdan üs alınacak ve üs olacak sayıları al


        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        a = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        b = input.nextInt();

        int total = 1;

        // Üssü hesaplamak için for döngüsü
        for (int i = 1; i <= b ; i++ ){
            total *= a;
        }
        System.out.println(a + "^" + b + " = " + total);
    }
}
