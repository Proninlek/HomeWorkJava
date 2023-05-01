import java.util.LinkedList;
import java.util.Random;

public class HomeWork10 {
    public static void main(String[] args) {

        LinkedList<Integer> list = getList(5, 1, 9);
        System.out.println(list);
        System.out.println(getSumm(list));
    }

    public static LinkedList<Integer> getList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
        }
        return list;
    }

    public static int getSumm(LinkedList<Integer> l) {
        int sum = 0;
        for (Integer number : l) {
            sum +=number;
        }
        return sum;
    }
}