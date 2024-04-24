package Week1;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç farklı sayı alınır
        System.out.print("1. Sayı : ");
        a = input.nextInt();

        System.out.print("2. Sayı : ");
        b = input.nextInt();

        System.out.print("3. Sayı : ");
        c = input.nextInt();

        // Sayıları göre sıralar
        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
            
        } else {
            if (a < b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }
    }
}
