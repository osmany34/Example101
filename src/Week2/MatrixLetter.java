package Week2;
public class MatrixLetter {
    public static void main(String[] args) {
        String[][] letter = new String[5][4]; //matris boyutu

        //harf matrisi
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {

                //b harfinin oluşturlması
                if (i == 0 || i == 4 || i == 2 && j != 3 || j == 0 || j == 3 && i != 0 && i != 4) {
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }

        // Harf matrisini ekrana yazdırma
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
