import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i, j;
        boolean a = true;
        int count = 0;

        while (a) {
            System.out.println("How much elements do you wanna add in your array? " +
                    "\n!ATTENTION! size > 5 && size <= 10");
            int answer = input.nextInt();

            if (answer > 5 && answer <= 10) {
// create a first array
                int[] array1 = new int[answer];

// add random elements
                for (i = 0; i < array1.length; i++) {
                    array1[i] = random.nextInt(100);
                }

                System.out.println(Arrays.toString(array1));

// if element is uneven, we'll count +1
                for (int res : array1) {
                    if (res % 2 == 1) {
                        count++;
                    }
                }
// create a second array with even elements
                int[] array2 = new int[array1.length - count];

                for (i = 0, j = 0; i < array1.length; i++) {
                    if (array1[i] % 2 != 0) {
                        continue;
                    } else {
                        array2[j] = array1[i];
                        j++;
                    }
                }
                
                System.out.println(Arrays.toString(array2));
                a = false;
            } else
                System.out.println("you enter an incorrect size! try again :)\n");
        }


    }
}
