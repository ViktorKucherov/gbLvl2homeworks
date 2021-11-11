package gb2.less3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1
        String[] wordsArray = new String[] {
                "first", "first", "first",
                "second", "second",
                "third", "third", "third", "third",
                "fourth",
                "fifth",
                "sixth", "sixth"
        };
        System.out.println("Распечатаем уникальные слова");
        printUnicWords(getUnicWords(wordsArray));

        System.out.println("Распечатаем статистику");
        showStatisticsOfWords(getStatisticsOfWords(wordsArray));

        // 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+79990125676");
        phoneBook.add("Ivanov", "+79880125676");
        phoneBook.add("Ivanov", "+79770125676");
        phoneBook.get("Ivanov");

        phoneBook.add("Sidorov", "+71235365666");
        phoneBook.add("Sidorov", "+77798679456");
        phoneBook.add("Sidorov", "+75678690777");
        phoneBook.get("Sidorov");


    }
    public static LinkedHashSet<String> getUnicWords(String... strings) {
        Set<String> result = new LinkedHashSet<>();
        for (String e: strings) {
            result.add(e);
        }
        return (LinkedHashSet<String>) result;
    }
    public static void printUnicWords(LinkedHashSet<String> list) {
        list.forEach(System.out::println);
    }

    public static LinkedHashMap<String, Integer> getStatisticsOfWords(String... strings) {
        Map<String, Integer> statistics = new LinkedHashMap<>();

        for (String keyWord: strings) {
            Integer countOfKeys = statistics.get(keyWord);
            if (countOfKeys == null) {
                countOfKeys = 0;
            }
            statistics.put(keyWord, ++countOfKeys);
        }
        return (LinkedHashMap<String, Integer>) statistics;
    }

    public static void showStatisticsOfWords(LinkedHashMap<String, Integer> statistics) {
        statistics.forEach((word, count) -> {
            System.out.println(word + ": " + count);
        });
    }

}
