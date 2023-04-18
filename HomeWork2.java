
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int num1 = inputScanner.nextInt();
    System.out.println("Введите второе число: ");
    int num2 = inputScanner.nextInt();
    System.out.println("Введите необходимое действие (+, -, *, /):");
    String a = inputScanner.next();
    char str = a.charAt(0);

    int result; //с делением не работает, но это наверное не главное

    if (str == '*') {
        result = num1 * num2;
        System.out.println("Итог = " + result);
        } 
    else if (str == '/'){
        result = num1 / num2;
        System.out.println("Итог = " + result);
        } 
    else if (str == '+'){
        result = num1 + num2;
        System.out.println("Итог = " + result);
        }
    else if (str == '-'){
        result = num1 - num2;
        System.out.println("Итог = " + result);
        } 
    else {
        System.out.println("Неверная команда");
        }
    }
}
