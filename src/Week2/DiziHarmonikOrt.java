package Week2;

public class DiziHarmonikOrt {
    public static void main(String[] args) {
        double[] number ={15,6,12,45,5,54};  // Dizi tanımlama ve örnek verileri atama
        double total = 0;   // Toplam değişkeni başlatma
        for (double element : number){
            total += 1.0 /element;
        }
        double harmonicAvarage = number.length / total;   // Harmonik ortalama hesaplama
        System.out.println("Dizinin Harmonik Ortalaması : " + harmonicAvarage);

    }
}
