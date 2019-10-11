import java.util.Scanner;

public class lesson2task1 {
    public static void main(String[] args) {
        int N = 0;
        System.out.println("Enter A: ");
        int A = new Scanner(System.in).nextInt();
        System.out.println("Enter B: (A < B) ");
        int B = new Scanner(System.in).nextInt();
        if (A > B) {
            System.out.println("Error");
        } else {
            for ( N = A; N < B; N++) {
                System.out.println(N);
            }
        }
    }
}
