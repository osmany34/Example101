package Week1;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, geo;

        Scanner input = new Scanner(System.in);

        //Matematik notu
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        //notun 0-100 aralığı olması
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz Matematik Notu. 0-100 arasında bir değer giriniz.");
            return;
        }

        //Türkçe notu
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        //notun 0-100 aralığı olması
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz Türkçe Notu. 0-100 arasında bir değer giriniz.");
            return;
        }

        //Kimya notu
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        //notun 0-100 aralığı olması
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz Kimya Notu. 0-100 arasında bir değer giriniz.");
            return;
        }

        //Fizik notu
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        //notun 0-100 aralığı olması
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz Fizik Notu. 0-100 arasında bir değer giriniz.");
            return;
        }

        //Geometri notu
        System.out.print("Geometri Notunuz : ");
        geo = input.nextInt();
        //notun 0-100 aralığı olması
        if (geo < 0 || geo > 100) {
            System.out.println("Geçersiz Geometri Notu. 0-100 arasında bir değer giriniz.");
            return;
        }

        //ortalama hesaplama
        double ort = (mat + turkce + fizik + kimya + geo) / 5;
        if (ort >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
        } else {
            System.out.println("Sınıfı Geçemediniz !");
        }
        System.out.println("Ortalamanız: " + ort);
    }
}

