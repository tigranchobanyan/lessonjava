import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x < 9) {
            if (x > 2) {
                System.out.println("Число больше 5 и меньше 10");
            } else {
                System.out.println("Неизвестное число");
            }
        } else {
            System.out.println("Неизвестное число");
        }


        if (x < 9 && x > 2) {
            System.out.println("Число больше 5 и меньше 10");
        } else {
            System.out.println("Неизвестное число");
        }


    }
}
