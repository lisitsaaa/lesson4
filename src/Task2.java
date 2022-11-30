import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int answer;
        int i;


// create a first array and print it
        System.out.print("How much elements do you wanna add in your array? ");
        answer = input.nextInt();
        int[] array1 = new int[answer];

        for (i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));

// min
        int min = array1[0];
        for (int res : array1) {
            if(res < min){
                min = res;
            }
        }
        System.out.println(min + " -> min");
// max
        int max = array1[0];
        for(int res : array1){
            if(res > max){
                max = res;
            }
        }
        System.out.println(max + " -> max");
// average value
        int average = 0;
        for(int res : array1){
            average = res + average;
        }
        System.out.println((average/answer) +" -> average value");

    }
}
