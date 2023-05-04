import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    Map<String, String> mapPhoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {

        if (phone.matches("[\\d]{11}") && name.matches("[А-Яа-я]+")) {
            if (mapPhoneBook.containsKey(phone)) {
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
            } else {
                mapPhoneBook.put(phone, name);
            }
        }
    }

    

public String getContactByPhone(String phone) {
        if (mapPhoneBook.containsKey(phone)) {
            return mapPhoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }
    }


public Set<String> getContactTwoNumbers(String phone, String name) {
    TreeSet<String> result = new TreeSet<>();
    String key = "";
    String namePlusNumber = "";
    if (phoneBookTreeMap.containsValue(name)){
        for(String k : phoneBookTreeMap.keySet()){
            if (phoneBookTreeMap.get(k).equals(name)){
                key = k;
                result.add(name + " - " + key + ", " + phone);
                namePlusNumber = key + ", " + phone;
                break;
                }
            }
        }
        phoneBookTreeMap.remove(key); // сюда передаем старый контакт по номеру (key) и удаляем его, чтобы остался в Map только один контакт с двумя номерами
        phoneBookTreeMap.put(namePlusNumber, name); // сюда добавляем в наш Map "новый" контакт уже с двумя номерами
    return result;
    }
}