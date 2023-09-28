import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int range = array.length;
        boolean exit = true;

        while(exit) {
            exit = false;

            for (int i = 0;i < range - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    exit = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
