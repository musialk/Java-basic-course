public class loop1 {
    public static void main(String[] args) {
        int a =5;
        // loop "while"
        while (a > 0) {
            System.out.println("a = " + a);
            a--;
        }
        System.out.println("end");

        // loop "do...while"
        do {
            System.out.println("a = " + a);
            a--;
        } while (a > 6);
        System.out.println("end");

        // loop "for"
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }


    }
}
