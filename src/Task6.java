import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] stringArray = {"Sasha", "Nikita", "Olga", "Svetlana", "Andrey", "Tanya"};
        System.out.println("array without sort: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray);
        System.out.println("array with sort: " + Arrays.toString(stringArray));
    }
}
