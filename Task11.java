//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.Map;

public class Task11 {
    private Map<String, String> map = new HashMap<>();

    void add(String numPassports, String lastName) {
        map.put(numPassports, lastName);
    }

    String getByNumPassport(String numPassport) {
        return numPassport + ": " + map.get(numPassport);
    }

    String getByLastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        if (stringBuilder.length() == 0) {
            return "записей нет.";
        }
        return stringBuilder.toString();
    }

    String getAllList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String getAllList2(){
        return map.toString();
    }
}

