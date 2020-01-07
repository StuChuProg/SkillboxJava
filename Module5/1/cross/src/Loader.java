public class Loader {
    public static void main(String[] args) {
        String[][] cross = {
                {"X", " ", " ", " ", "X"},
                {" ", "X", " ", "X", " "},
                {" ", " ", "X", " ", " "},
                {" ", "X", " ", "X", " "},
                {"X", " ", " ", " ", "X"},
        };

        for (int i =0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
}
