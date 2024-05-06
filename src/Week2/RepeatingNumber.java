package Week2;

import java.util.Arrays;

public class RepeatingNumber {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {4,7,4,2,2,9,10,21,10,33,9,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // Tekrar eden çift sayıları bulma
        for (int i = 0; i < list.length; i++){
            for (int j =0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j] && list[i] % 2 == 0)){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        // Duplicate dizisindeki 0 olmayan değerler
        System.out.println("Tekrar eden çift sayılar : ");
        for (int value : duplicate){
            if (value !=0){
                System.out.println(value);
            }
        }
    }
}
