import java.util.*;

public class Loader {
    public static void main(String[] args){
        System.out.println("Введите e-Mail начиная с команды ADD");
        TreeSet<String> mail = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("'EXIT'  для выхода");
            String command = scanner.nextLine().trim();
            if (command.trim().equals("EXIT")) {
                break;
            }
            if (command.matches("ADD\\s\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}\\b")) {
                String[] comm = command.split("\\s+", 2);
                mail.add(comm[1]);
            }else {System.out.println("пожалуйста, проверьте правильность написаниия e-Mail");}
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
