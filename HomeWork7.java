import java.util.*;
import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = getList(5, 1, 9);
        System.out.println(list);
        System.out.println(getReverseList(list));
    }

    public static LinkedList<Integer> getList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
            }
        return list;
    }

    public static List<Integer> getReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> resultList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            resultList.add(iterator.previous());
        }
        return resultList;
    }
}