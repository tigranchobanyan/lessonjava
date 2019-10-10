import java.util.Scanner;

public class lesson2task2 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("N:");
        int n = SCANNER.nextInt();

        double result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result * (double) i;
        }
        System.out.print(result);
    }
}