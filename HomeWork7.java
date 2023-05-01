import java.util.Collections;
import java.util.LinkedList;

public class HomeWork7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("77");
        list.add("25");
        list.add("69");
        list.add("3");
        list.add("нога");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}