import java.util.Arrays;

public class array3_practice {
    public static void main(String[] args) {
        int[] myArray = new int[]{3,5,6,2,-8,6};

        System.out.println("Array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 -i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println("Array: " + Arrays.toString(myArray));
    }
}
