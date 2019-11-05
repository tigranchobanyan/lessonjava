import java.util.Scanner;

public class lesson3task1 {
    public static void main(String[] args) {
        System.out.println("вести команду робота( 0 - продолжать движение, 1 - поворот налево, -1 - поворот направо)");
        Scanner scanner = new Scanner(System.in);
        char direction = 'S';
        int N = scanner.nextInt();
        switch (N) {
            case 1:
                direction = 'Z';
                System.out.println(direction);
                break;
            case -1:
                direction = 'V';
                System.out.println(direction);
                break;
            case 0:
                System.out.println(direction);
        }
    }
}
