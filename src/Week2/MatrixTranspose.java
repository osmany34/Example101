package Week2;

import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // matrisin satır ve sütun sayısı
        System.out.print("Matrisin satır sayısını girin: ");
        int row = input.nextInt();
        System.out.print("Matrisin sütun sayısını girin : ");
        int col = input.nextInt();

        // matrisin elemanlarını alma
        int[][] matrix = new int[row][col];

        System.out.println("Matrisin elemanlarını girin : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Transpoz matris oluşturma
        int[][] transpose = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matris : ");
        printMatrix(matrix);

        System.out.println("Transpoze : ");
        printMatrix(transpose);

    }

    //Matrisi ekrana yazdırmak için fonksiyon
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}