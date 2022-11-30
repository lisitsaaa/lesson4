import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i;

// create a first array; add elements; and print result
        System.out.print("How much elements do you wanna add in your array? ");
        int answer = input.nextInt();
        int[] array1 = new int[answer];

        for (i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array1));

// change uneven indexes to 0
        for (i = 0; i < array1.length; i++) {
            if (i % 2 == 1) {
                array1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
