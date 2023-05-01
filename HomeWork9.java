import java.util.Arrays;

public class HomeWork9 {
    private String[] arr = new String[10];
    private int size = 0;
    private int currentFirst = 0;

    int size() {
        return size - currentFirst;
    }

    boolean empty() {
        return size == 0;
    }

    void enqueue(String s) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, size * 2);
        }
        arr[size++] = s;
    }

    String first() {
        if (size > 0) return arr[currentFirst];
        else return null;
    }

    String dequeue() {
        if (size - currentFirst > 0) return arr[currentFirst++];
        else return null;
    }

    String viewAll() {
        StringBuilder sb = new StringBuilder(size-currentFirst);
        for (int i = currentFirst; i < size; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString();
    }

}