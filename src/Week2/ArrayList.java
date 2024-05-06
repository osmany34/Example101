package Week2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan alma
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        // Diziyi oluşturma ve elemanları kullanıcıdan alma
        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            array[i] = input.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Sıralama : ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
