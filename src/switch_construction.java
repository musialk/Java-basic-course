import java.util.Scanner;

public class switch_construction {
    public static void main(String[] args) {
        System.out.println("wprowadz ocene: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Wprowadzona ocena to: " + input);

        switch (input) {
            case 1,2 -> System.out.println("Niedostateczna");
            case 3 -> System.out.println("dostateczna");
            case 4 -> System.out.println("dobra");
            case 5 -> System.out.println("bardzo dobra");
        }
    }

}
