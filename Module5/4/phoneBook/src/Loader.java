import java.util.*;

public class Loader {
    public static void main(String[] args){
        System.out.println("Пожалуйста, введите телефон и/или имя");
        TreeMap<String, String> phoneBook = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        for (;;){

            String sc = scanner.nextLine().trim();
            if(sc.equals("LIST")){
                printMap(phoneBook);
                continue;
            }
            String name;
            String number;
            if (sc.matches("\\d")){
                System.out.println("Введите имя абонента");
                name = sc;
            }
            if (sc.matches("\\^[A-Za-zА-яёЁ]")) {
                System.out.println("Введите телефон");
                number = sc;
            }
            if (sc.matches("\\^[A-Za-zА-яёЁ]\\s+\\d")){
                String[] com = sc.split("\\s+", 2);
                name = com[0];
                number = com[1];
            }
            if (sc.matches("\\d\\s+\\b[A-Za-zА-яёЁ]")){
                String[] com = sc.split("\\s+", 2);
                name = com[1];
                number = com[0];
            }
            phoneBook.put(name, number);

            if (phoneBook.containsKey(name)) {
                printMap(name, number);
                continue;
            }
            if (phoneBook.containsKey(number)) {
                printMap();
                continue;
            }
        }
    }
    private static void printMap(Map<String, String>map){
        for (String key :map.keySet()){
            System.out.println(key + "< = >" + map.get(key));
        }
    }
}
