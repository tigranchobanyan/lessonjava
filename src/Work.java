import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x < y) {
            System.out.println("первое число меньше второго");
        } else if (x > y) {
            System.out.println("первое число больше второго");
        } else if (x == y) {
            System.out.println("два числа равны");
        }
    }
}
