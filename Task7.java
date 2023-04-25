public class Task7 {
    static boolean ex2(String s){
        /*
        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
         (возвращает boolean значение).

        Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
         */
        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);
    }
}
