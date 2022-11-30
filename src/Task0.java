import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task0 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i;
        int answer;
        int res = 0;

// add elements in array
        System.out.print("How much elements do you want to add in your array? ");
        answer = input.nextInt();
        int[] array0 = new int[answer];

        for (i = 0; i < array0.length; i++) {
            array0[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array0));

// found a specific element in array
        System.out.print("which element do you want to found? ");
        answer = input.nextInt();

        for (int j : array0) {
            if (j == answer) {
                res++;
            }
        }

// print result
        if (res != 0) {
            System.out.println("array INCLUDE an element " + answer);
        } else {
            System.out.println("sorry! but array DOESN'T INCLUDE an element " + answer);
        }
    }
}
