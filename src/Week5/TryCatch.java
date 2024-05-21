package Week5;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        // 10 elemanlı tek boyutlu dizi tanımlanması
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Kullanıcıdan indeks almak için
        Scanner input = new Scanner(System.in);
        System.out.print("İndeksi giriniz: ");
        int index = input.nextInt();

        // Metodu çağırarak sonucu ekrana yazdırma
        String result = getElementIndex(array, index);
        System.out.println(result);

        input.close();
    }

    // Belirli bir indeksteki elemanı döndüren ve hata kontrolü yapan metod
    public static String getElementIndex(int[] array, int index) {
        try {
            return "Eleman: " + array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Hata: Geçersiz index !";
        }
        finally {
            System.out.println("Sorgulama İşlemi Tamamlandı !");
        }
    }








}
