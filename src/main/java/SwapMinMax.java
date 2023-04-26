import java.util.Scanner;

/**
 * Перестановка максимального и минимального элементов массива
 *
 * Заполняет массив случайными числами, находит максимальное и минимальное, и меняет их местами
 *
 * @author Полина Тревогина
 */

public class SwapMinMax {


    static Scanner scanner;

    private final static int size = 20;

    public static void swapMinMax() {
        scanner = new Scanner(System.in);

        System.out.println("--- Перестановка минимального и максимального элементов ---");
        System.out.println("");


        System.out.println("Заполняем массив");
        int[] array = fillArray();
        printArray(array);

        int minInd = findMin(array);
        int maxInd = findMax(array);

        array = swap(array, minInd, maxInd);

        System.out.println("Переставляем элементы под номерами " + minInd + " и " + maxInd);


        System.out.println("Результат перестановки: ");
        printArray(array);
        System.out.println("");
        System.out.println("--- Конец перестановки ---");
    }

    private static int[] fillArray() {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) ((Math.random()) * 20 - 10);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int findMin(int[] array) {
        int min = 20;
        int minInd = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        return minInd;
    }

    private static int findMax(int[] array) {
        int max = -20;
        int maxInd = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                maxInd = i;
            }
        }
        return maxInd;
    }

    private static int[] swap(int []array, int min, int max) {
        int swap=0;
        swap=array[max];
        array[max]=array[min];
        array[min]=swap;
        return array;
    }

}

