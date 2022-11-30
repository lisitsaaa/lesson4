import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;
        int[] array1 = new int[5];
        int[] array2 = new int[5];

// print a first array
        for (i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        System.out.println("the first array -> " + Arrays.toString(array1));

// print a second array
        for (i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }
        System.out.println("the second array -> " + Arrays.toString(array2));

// count an average value for the first array and print a result
        int average1 = 0;
        for (int res : array1) {
            average1 = res + average1;
        }
        average1 = average1 / 5;
        System.out.println("average value for the first array: " + average1);

// count an average value for the second array and print a result
        int average2 = 0;
        for (int res : array2) {
            average2 = res + average2;
        }
        average2 = average2 / 5;
        System.out.println("average value for the second array: " + average2);

// comparison arrays
        if (average1 > average2) {
            System.out.println("average value for the first array is bigger than " +
                    "average value for the second array");
        } else if (average1 < average2) {
            System.out.println("average value for the second array is bigger than " +
                    "average value for the first array");
        } else {
            System.out.println("average value for the first array and " +
                    "average value for the second array are equal");
        }


    }
}
