import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Введите команду");
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 'EXIT'  для выхода");
            String command = scanner.nextLine().trim();
            if (command.trim().equals("EXIT")) {
                break;
            }

            if (command.matches("ADD\\s\\d+\\D+")) {
                String[] com = command.split("\\s+", 3);
                if (Integer.parseInt(com[1]) > todoList.size()){

                    todoList.add(todoList.size(), com[2]);
                }else {
                todoList.add(Integer.parseInt(com[1]), com[2]);}
            }

            if (command.matches("ADD\\s\\D+")) {
                String[] comm = command.split("\\s+", 2);
                todoList.add(comm[1]);
            }

            if (command.matches("EDIT\\s\\d+\\D+")) {
                String[] com = command.split("\\s+", 3);
                if (Integer.parseInt(com[1]) > todoList.size()) {
                   System.out.println("Данной строки не существует, проверьте номер строки");
                }else{
                    todoList.set(Integer.parseInt(com[1]), com[2]);}
            }
            if (command.matches("DELETE\\s\\d+")) {
                String[] com = command.split("\\s+");
                if (Integer.parseInt(com[1]) > todoList.size()) {
                    System.out.println("Данной строки не существует, проверьте номер строки");
                }else{
                todoList.remove(Integer.parseInt(com[1]));}
            }
            if (command.matches("LIST")) {
                for (int k = 0; k < todoList.size(); k++) {
                    System.out.println(k + " - " + todoList.get(k));
                }
            }
            else{
                System.out.println("Вы ввели не поддерживаемый формат");
                System.out.println("Поддерживаемые команды: \n\tADD, \n\tEDIT, \n\tDELETE, \n\tLIST");
            }
        }
        scanner.close();
        System.out.println("Вы вышли из ввода данных!");
    }
}
