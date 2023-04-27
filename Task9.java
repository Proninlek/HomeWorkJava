import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    static void ex1(){
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До скорой встречи!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
            System.out.println();
        }
    }
}

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    boolean repeat = true;
    while (repeat) {
        System.out.printf("%s\n>>> ", "Введите строку вида text~num:");
        String line = scanner.nextLine();

        switch (line) {
            case "print":
                ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
                 while (listIterator.hasPrevious()) {
                     System.out.printf("%s", listIterator.previous());
                 }
                break;
            case "revert":
                linkedList.removeLast();
                break;
            case "exit":
                repeat = false;
                break;
            default:
                linkedList.add(line);
                break;
        }
    }
}

static void ex3(){
    /*
    1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
     */
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    while (!stack.isEmpty()){
        System.out.println(stack.pop());
    }
    System.out.println();

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i < 5; i++) {
        queue.add(i);
    }
    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }
}