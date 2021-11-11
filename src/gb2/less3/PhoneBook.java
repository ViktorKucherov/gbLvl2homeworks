package gb2.less3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook(){

        phoneBook = new LinkedHashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        Set<String> phones = new LinkedHashSet<>();
        if (phoneBook.containsKey(surname)) {
            phones = phoneBook.get(surname);
            phones.add(phoneNumber);
        } else {
            phones.add(phoneNumber);
        }
        phoneBook.put(surname, phones);
    }

    public void get(String surname) {
        System.out.println(surname);
        System.out.println(phoneBook.get(surname));
    }
}
