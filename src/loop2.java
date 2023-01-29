public class loop2 {
    public static void main(String[] args) {
        int a = 5;

        // break
        while (true) {
            a--;
            System.out.println("a = " + a);
            if (a == 2) {
                break; // continue
            }
        }
        System.out.println("end");

        // continue
        while (a > 0) {
            a--;

            if (a == 2) {
                continue;
            }
            System.out.println("a = " + a);
        }
        System.out.println("end");
    }
}
