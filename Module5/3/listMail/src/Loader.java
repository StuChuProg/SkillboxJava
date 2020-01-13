import java.util.*;

public class Loader {
    public static void main(String[] args){
        System.out.println("Введите команду");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("'EXIT'  для выхода");
            String command = scanner.nextLine().trim();
            if (command.trim().equals("EXIT")) {
                break;
            }

            TreeSet<String> mail = new TreeSet<>();

            if (command.matches("ADD\\s\\D+")) {
                String[] comm = command.split("\\s+", 2);
                mail.add(comm[1]);
            }
            for (String eMail : mail) {
                System.out.println(eMail);
            }
            if (command.matches("LIST")) {
                for (String eMail : mail) {
                    System.out.println(eMail);
                }
            }
        }
        scanner.close();
        System.out.println("Вы вышли из ввода данных!");
    }
}
