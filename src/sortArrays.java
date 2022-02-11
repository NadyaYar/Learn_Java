import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 7, 2};
        System.out.println(Arrays.toString(arrayFromMinToMax(array1)));
        System.out.println(Arrays.toString(arrayFromMaxToMin(array1)));
    }
    static int[] arrayFromMinToMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static int[] arrayFromMaxToMin(int[] array) {
         for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
