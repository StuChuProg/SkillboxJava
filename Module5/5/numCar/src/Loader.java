import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        ArrayList<String> listN = new ArrayList<>();


        String numCar = new String();
        char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        char[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int region = 1; region < 200; region++) {
            for (int num = 0; num < number.length; num++) {
                for (int iL = 0; iL < letters.length; iL++) {
                    numCar = numCar + letters[iL] + number[num] + number[num] + number[num] + letters[iL] + letters[iL];
                    if(region <10){
                        numCar = numCar + '0' + region;
                    }else {
                        numCar = numCar + region;
                    }
                }
            }
            listN.add(numCar);
            System.out.println(numCar);
            numCar = "";
        }


        System.out.println(listN.size());
//        Scanner scanner = new Scanner(System.in);
//        for (;;){
//
//        }
    }
}
