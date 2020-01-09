public class Loader {
    public static void main(String[] args) {
        String[][] cross = new String[5][5];

        for (int numRows=0; numRows < cross.length; numRows++){
            for(int numCols = 0; numCols < cross[numRows].length; numCols++){
                if ((numCols+numRows == 4) || (numCols == numRows)){
                    cross[numRows][numCols] = "X";
                }else cross[numRows][numCols] = " ";
            }
        }
        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[0].length; j++) {
                System.out.print(" " + cross[i][j] + " ");
            }
            System.out.println();
        }
    }
}
