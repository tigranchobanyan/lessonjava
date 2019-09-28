import java.util.Scanner;

public class lesson1task1 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number > 0) {
            number = number + 1;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
