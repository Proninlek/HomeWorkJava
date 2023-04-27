public class HomeWork6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
        "Марс", "Юпитер", "Сатурн", "Меркурий", "Нептун",
        "Венера", "Нептун", "Сатурн", "Юпитер", "Земля",
        "Венера", "Сатурн", "Уран", "Земля", "Марс");

        Map<String, Long> frequency = 
            list.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
