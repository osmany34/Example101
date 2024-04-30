package Week2;

public class PalindromNumbers {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            //System.out.println("===========");
            //System.out.println("Number => " + temp);
            lastNumber = temp % 10;
            //System.out.println("Son Basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);
            temp /= 10;
            //System.out.println("Yeni Temp => " + temp);
        }
        //palindrom sayı olduğunu doğrulayan kod
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    //kodun çıktısı
    public static void main(String[] args) {
        System.out.println(isPalindrom(404));

    }
}
