import java.util.*;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите телефон и/или имя");

        TreeMap<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            String sc = scanner.nextLine().trim();
            if (sc.matches("LIST")) {
                printMap(phoneBook);
                continue;
            }
            if (phoneBook.containsKey(sc) || phoneBook.containsValue(sc)) {
                Set<Map.Entry<String, String>> set;
                set = phoneBook.entrySet();
                for (Map.Entry<String, String> me : set) {
                    System.out.print(me.getKey() + " < = > " + me.getValue());
                }
            } else {
                if (sc.matches("\\b[A-Za-zА-яёЁ]+")) {
                    String name = sc;
                    System.out.println("Введите номер телефона");
                    String number = scanner.nextLine().trim();
                    if (phoneBook.containsValue(number)) {
                        System.out.println("Данный номеру присвоено другмое имя");
                    } else {
                        phoneBook.put(name, number);
                    }
                }
                if (sc.matches("\\d+")) {
                    String number = sc;
                    System.out.println("Введите Имя");
                    String name = scanner.nextLine().trim();
                    if (phoneBook.containsValue(name)) {
                        System.out.println("Данное имя присвоено другому номеру");
                    } else {
                        phoneBook.put(name, number);
                    }
                }

                if (sc.matches("\\b[A-Za-zА-яёЁ]+\\s+\\d+")) {

                    String[] com = sc.split("\\s+", 2);
                    String name = com[0].trim();
                    String number = com[1].trim();
                    if (phoneBook.containsValue(name)) {
                        System.out.println("Данное имя присвоено другому номеру");
                        continue;
                    }
                    if (phoneBook.containsValue(number)) {
                        System.out.println("Данный номеру присвоено другмое имя");
                        continue;
                    } else {

                        phoneBook.put(name, number);
                    }
                }
                if (sc.matches("\\d+\\s+\\b[A-Za-zА-яёЁ]+")) {

                    String[] com = sc.split("\\s+", 2);
                    String name = com[1].trim();
                    String number = com[0].trim();
                    if (phoneBook.containsValue(name)) {
                        System.out.println("Данное имя присвоено другому номеру");
                        continue;
                    }
                    if (phoneBook.containsValue(number)) {
                        System.out.println("Данный номеру присвоено другмое имя");
                        continue;
                    } else {
                        phoneBook.put(name, number);
                    }
                }
            }
        }
    }

    private static void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " < = > " + map.get(key));
        }
    }
}
