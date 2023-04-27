import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import Funcstream.Collectors;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWork6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
        "Марс", "Юпитер", "Сатурн", "Меркурий", "Нептун",
        "Венера", "Нептун", "Сатурн", "Юпитер", "Земля",
        "Венера", "Сатурн", "Уран", "Меркурий", "Земля", "Марс");

        Map<String, Long> frequency = 
            list.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
