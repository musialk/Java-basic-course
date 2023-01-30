import java.lang.reflect.Array;
import java.util.Arrays;

public class array2_practice {
    public static void main(String[] args) {
        int[] myArray = new int[]{3,5,6,2,-8,6};

        int desiredIndex = 3;
        int desiredValue = 7;
        System.out.println("Array primary: " + Arrays.toString(myArray));

        for (int i = myArray.length -1; i > desiredIndex ; i--) {
            myArray[i] = myArray[i - 1];
        }
        System.out.println("array before: " + Arrays.toString(myArray));
        myArray[desiredIndex] = desiredValue;
        System.out.println("array after: " + Arrays.toString(myArray));
    }
}
