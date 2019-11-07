import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Задать  длинну массива ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println(" длина массива  " + number);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            String text = getText(array[i]);
            System.out.println(text);
        }

    }

    public static String getText(int number) {
        String text = "";
        if (number > -10 && number < 10) {
            if (number < 0) {
                if (number % 2 == 0) {
                    text = number + " это однозначное , четное , отрицательное ";
                } else {
                    text = number + " это однозначное , нечетное , отрицательное";
                }

            } else {
                if (number % 2 == 0) {
                    text = number + " это однозначное , четное , положительное";
                } else {
                    text = number + " это однозначное , нечетное , положительное";
                }
            }
        } else if (number > -100 && number < 100) {
            if (number < 0) {
                if (number % 2 == 0) {
                    text = number + " это двузначное , четное , отрицательное ";
                } else {
                    text = number + "это двузначное , нечетное , отрицательное ";
                }
            } else {
                if (number % 2 == 0) {
                    text = number + " это двузначное , четное , положительное ";
                } else {
                    text = number + " это двузначное , нечетное , положительное ";
                }

            }
        } else if (number > -1000 && number < 1000) {
            if (number < 0) {
                if (number % 2 == 0) {
                    text = number + " это трехзначное , четное , отрицательное ";
                } else {
                    text = number + " это трехзначное , нечетное , отрицательное ";
                }
            } else {

                if (number % 2 == 0) {
                    text = number + " это трехзначное , четное , положительное ";
                } else {
                    text = number + " это трехзначное , нечетное , положительное ";
                }
            }
        }
        return text;
    }
}


