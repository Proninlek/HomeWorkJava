import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число N для первой и второй части задания: ");
        int n = scanner.nextInt();
        int t = 1;
        int sqrt = 1;
        t = n * (n + 1) * 1 / 2;
        for (int i = 1; i <= n; i++) {
            sqrt = sqrt * n;
        }
    System.out.println("N-ое треугольного числа " + n + " " + "равна " + t);
    System.out.println("n! числа " + n + " равен " + sqrt);

        for (int k = 2; k <= 1000; k++) {
            boolean a = true;
            int q = (int) Math.sqrt(k);
            for (int j = 2; j < k; j++) {
                if ((k % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println("Число " + k + " - простое");
            }
        }
    }
}
