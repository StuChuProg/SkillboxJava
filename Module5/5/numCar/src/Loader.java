import java.util.*;

public class Loader {
    public static void main(String[] args) {
        ArrayList<String> listN = new ArrayList<>();

        String numCar = new String();
        char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};


        for (int num = 1; num < 10; num++) {
            for (int iL = 0; iL < letters.length; iL++) {
                for (int region = 1; region < 200; region++) {
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + num + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + num + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + (num - 1) + num + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + (num - 1) + num + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + (num - 1) + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + (num - 1) + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + num + (num - 1) + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + num + (num - 1) + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + num + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + num + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + (num - 1) + num + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + (num - 1) + num + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + (num - 1) + num + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + (num - 1) + num + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 9) {
                        numCar = numCar + letters[iL] + num + num + (num - 1) + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    } else {
                        numCar = numCar + letters[iL] + num + num + (num - 1) + letters[iL] + letters[iL] + '0' + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                    if (region > 99) {
                        numCar = numCar + letters[iL] + region + letters[iL] + letters[iL] + region;
                        listN.add(numCar);
                        numCar = "";
                    }
                }
            }
            for (int iL = 0; iL < letters.length; iL++) {
                for (int region = 1; region < 200; region++) {
                    for (int lI = letters.length - 1; lI > 0; lI--) {
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + num + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + num + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + (num - 1) + num + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + (num - 1) + num + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + (num - 1) + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + (num - 1) + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + num + (num - 1) + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + num + (num - 1) + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + num + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + num + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + (num - 1) + num + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + (num - 1) + num + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + (num - 1) + num + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + (num - 1) + num + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 9) {
                            numCar = numCar + letters[iL] + num + num + (num - 1) + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        } else {
                            numCar = numCar + letters[iL] + num + num + (num - 1) + letters[lI] + letters[iL] + '0' + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                        if (region > 99) {
                            numCar = numCar + letters[iL] + region + letters[lI] + letters[iL] + region;
                            listN.add(numCar);
                            numCar = "";
                        }
                    }
                }
            }
        }
        HashSet<String> set = new HashSet<>();
        set.addAll(listN);
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(listN);
        System.out.println(listN.size());
        System.out.println("Пожалуйста, введите номер автомобиля");
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String nCar = scanner.nextLine().trim();

            long start1 = System.currentTimeMillis();
            listN.contains(nCar);
            long duration1 = System.currentTimeMillis() - start1;
            System.out.println("Время при прямом поиске - " + duration1 + "; результат - " + listN.contains(nCar));

            Collections.sort(listN);
            long start2 = System.currentTimeMillis();
            Collections.binarySearch(listN, nCar);
            long duration2 = System.currentTimeMillis() - start2;
            System.out.println("Время при бинарном поиске - " + duration2 + "; результат - " + listN.contains(nCar));

            long start3 = System.currentTimeMillis();
            set.contains(nCar);
            long duration3 = System.currentTimeMillis() - start3;
            System.out.println("Время при HashSet поиске - " + duration3 + "; результат - " + listN.contains(nCar));

            long start4 = System.currentTimeMillis();
            tree.contains(nCar);
            long duration4 = System.currentTimeMillis() - start4;
            System.out.println("Время при TreeSet поиске - " + duration4 + "; результат - " + listN.contains(nCar));
        }
    }
}
