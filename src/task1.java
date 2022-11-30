import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i, j;
        int answer;
        int count = 0;
            System.out.print("How much elements do you wanna add in your array? ");
            answer = input.nextInt();
            int[] array1 = new int[answer];

            for (i = 0; i < array1.length; i++) {
                array1[i] = random.nextInt(50);
            }
            System.out.println(Arrays.toString(array1));

            System.out.print("which element do you want to remove? ");
            answer = input.nextInt();

            for (int res : array1) {
                if (res == answer) {
                    count += 1;
                }
            }

            int[] array2 = new int[array1.length - count];

            for (i = 0, j = 0; i < array1.length; i++) {
                if (array1[i] == answer) {
                    continue;
                } else {
                    array2[j] = array1[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(array2));
    }
}
