package Week2;

import java.util.Arrays;

public class DiziMinMaxSayi {
    public static void main(String[] args) {
        int[] number = {10, 9, 22, 1, 93, -6, -53, 0}; //Dizi tanımladım
        int inputNumber = 21;
        Arrays.sort(number); //Diziyi sıralama

        int numberSmaller = Integer.MIN_VALUE; //Girilen en küçük sayıyay yakın sayı
        for (int num : number) {
            if (num < inputNumber) {
                numberSmaller = num;
            } else {
                break;
            }
        }

        int numberGreater = Integer.MAX_VALUE; //Girilen en büyük sayıya yakın sayı
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] > inputNumber) {
                numberGreater = number[i];
            } else {
                break;
            }
        }
        System.out.println("Dizi : " + java.util.Arrays.toString(number));
        System.out.println("Girilen Sayı : " + inputNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + numberSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + numberGreater);

    }
}
