import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i;

// create a array; add elements; and print result
        System.out.print("How much elements do you wanna add in your array? ");
        int answer = input.nextInt();
        int[] array = new int[answer];
        boolean isSorted = false;

        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array before bubble sort: " + Arrays.toString(array));

        while (!isSorted) {
            isSorted = true;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int res = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = res;
                }
            }
        }
        System.out.println("array after bubble sort: " + Arrays.toString(array));

    }
}
