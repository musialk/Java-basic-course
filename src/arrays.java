import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] myArray = new String[5];
        myArray[0] = "Zbyszek";
        myArray[1] = "Karol";
        myArray[2] = "Bartek";
        myArray[3] = "Stefan";

        String[] myArray2 = new String[]{"Stefan", "Zbyszek"};

        System.out.println(myArray2[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("array[" + i + "]: " + myArray[i]);
        }

        for (String element : myArray) {
            System.out.println("next elem: " + element);
        }

        System.out.println(Arrays.toString(myArray));
    }

}
