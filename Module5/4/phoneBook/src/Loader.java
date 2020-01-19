import java.util.*;

public class Loader {
    public static void main(String[] args){
        System.out.println("Пожалуйста, введите телефон и/или имя");
        TreeMap<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String name = " ";
       String number = " ";
        for (;;){

            String sc = scanner.nextLine().trim();
            if(sc.equals("LIST")){
                printMap(phoneBook);
                continue;
            }

          //  int key = 0;
        //    int count = 0;
           // for (int i = 0; i < phoneBook.size(); i++) {
             //   if (phoneBook.containsKey(name)) {
               //     count++;
            //        key = i;
              //      continue;}
          //      if (phoneBook.containsValue(number)) {
            //        count++;
              //      key = i;;
                //    continue; }}
        //    if (count >= 2){
        //        System.out.println(phoneBook.get(name) + " < = > " + phoneBook.get(phoneBook.get(key))); }

            if (sc.matches("\\d+")){
                name = sc;
                System.out.println("Введите имя абонента");

            }
            if (sc.matches("\\b[A-Za-zА-яёЁ]+")) {
                System.out.println("Введите телефон");
                number = sc;
            }
            if (sc.matches("\\b[A-Za-zА-яёЁ]+\\s+\\d+")){

                String[] com = sc.split("\\s+", 2);
                name = com[0];
                number = com[1];
            }
            if (sc.matches("\\d+\\s+\\b[A-Za-zА-яёЁ]+")) {

                String[] com = sc.split("\\s+", 2);
                name = com[1];
                number = com[0];
            }
            phoneBook.put(name, number);


        }
    }

    private static void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " < = > " + map.get(key));
        }
    }
}
