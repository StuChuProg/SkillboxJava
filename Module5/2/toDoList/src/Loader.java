import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Введите команду");

        ArrayList<String> todoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine().trim();

        int quantitySpace = 0;

        String ADD = "ADD";
        String LIST = "LIST";
        String EDIT = "EDIT";
        String DELETE = "DELETE";

        String numbool = "f";

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == ' ') {
                quantitySpace = quantitySpace + 1;
            }
        }
        int space = command.indexOf(' ');

        if (quantitySpace > 1) {

            String com = command.substring(0, space);
            String numText = command.substring(space).trim();
            int space1 = numText.indexOf(' ');
            String number = numText.substring(0, space1).trim();
            for (int i = 0; i < number.length(); i++) {
                for (int j = '0'; j < '9'; j++) {
                    if ((char) i == number.indexOf(j)) {
                        numbool = "t";
                    }
                }
            }

            if (com.equalsIgnoreCase(ADD)) {

                if (numbool.equals("t")) {
                    if (Integer.parseInt(number) > (todoList.size()-1)){
                        todoList.add(todoList.size(), numText.substring(space1).trim());
                    }else {
                    todoList.add(Integer.parseInt(number), numText.substring(space1).trim());}

                } else {
                    todoList.add(numText);
                }
            }
            if (com.equalsIgnoreCase(EDIT)) {
                todoList.add(Integer.parseInt(number), numText.substring(space1).trim());
                System.out.println("work");
            }

        }

        if (quantitySpace == 1 && command.substring(0, space).equalsIgnoreCase(DELETE)){
             todoList.remove(Integer.parseInt(command.substring(space).trim()));

        }
        if (quantitySpace == 0 && command.equals(LIST)) {

            for (int k = 0; k < todoList.size(); k++) {
                System.out.println(todoList.get(k));
          }
       }

    }
}
