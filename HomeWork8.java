import java.util.*;

public class HomeWork8 {
    public static void main(String[] args) {

        HomeWork9 homeWork9 = new HomeWork9();
        String [] arr = ("Скорее бы это закончилось " +
                "Хочется есть и спать").split(" ");
        for (String word : arr) {
            homeWork9.enqueue(word);
        }
        System.out.println(homeWork9.viewAll());
        System.out.println(homeWork9.size());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.first());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.empty());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.size());
        System.out.println(homeWork9.viewAll());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.dequeue());
        System.out.println(homeWork9.dequeue());
    }
}