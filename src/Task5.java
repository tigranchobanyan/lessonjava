import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(hakarakMasiv(array)));

    }

    static int[] hakarakMasiv(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        return array;
    }
}
