import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Введите команду");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("'exit'  для выхода");
            String typed = scanner.nextLine();
            if (typed.trim().equals("exit")) {
                break;
            }

            ArrayList<String> todoList = new ArrayList<>();
            String command = scanner.nextLine().trim();
            if (command.matches("ADD\\D+"))
            {
                String[] com = command.split("\\s+");
                String num = com[1];
                String numbool = "f";
                for (int i = 0; i < num.length(); i++) {

                    for (int j = '0'; j < '9'; j++) {

                        if ((char) i == num.indexOf(j)) {

                            numbool = "t";

                        }

                    }

                }
                if (numbool.equals("t")){
                    String[] comm = command.split("\\s+", 3);
                    if (Integer.parseInt(num) > (todoList.size()-1)){
                todoList.add((todoList.size()-1), comm[2]);
                    }else {
                        todoList.add(Integer.parseInt(comm[1]), comm[2]); }
                }
                else {
                    String[] comm = command.split("\\s+", 2);
                    todoList.add(comm[1]);
                }
            }

            if (command.matches("EDIT\\D+"))
            {
                String[] com = command.split("\\s+", 3);
                todoList.set(Integer.parseInt(com[1]), com[2]);
            }
            if (command.matches("DELETE\\D+"))
            {
                String[] com = command.split("\\s+", 2);
                todoList.remove(Integer.parseInt(com[1]));
            }
            if (command.matches("LIST\\D+"))
            {
                for (int k = 0; k < todoList.size(); k++) {

                    System.out.println(k + " - " + todoList.get(k));

                }
            }

        }

        scanner.close();
        System.out.println("Exit!");
    }
}
