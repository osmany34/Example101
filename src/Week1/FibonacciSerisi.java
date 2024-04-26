package Week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int memberNumber = input.nextInt();

        int beforeNumber = 0;
        int afterNumber = 1;

        // Fibonacci serisini yazdır
        System.out.println(memberNumber + " Elemanlı Fibonacci Serisi :");

        for (int i = 1; i <= memberNumber; i++) {
            System.out.print(beforeNumber + " ");

            // Fibonacci serisinin bir sonraki elemanını hesapla
            int presentNumber = beforeNumber + afterNumber;
            beforeNumber = afterNumber;
            afterNumber = presentNumber;
        }
    }
}
