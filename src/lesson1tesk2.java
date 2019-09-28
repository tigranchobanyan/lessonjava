import java.util.Scanner;

public class lesson1tesk2 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y;
        if (x > 0) {
            y = 2 * x + 1;
        } else if (x == 0) {
            y = 0;

        } else {
            y = 3 * x - 5;
        }
        System.out.println("y=" + y);
    }
}
