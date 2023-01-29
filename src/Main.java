public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        String c = "zajavka1";
        String d = "zajavka2";
        boolean e = true;
        boolean f = false;
        int g = 3;
        int h = 4;

        g += 2;
        h += 2;

//        g++;
//        h--;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("c.equals(d): " + (c.equals(d)));
        System.out.println("!c.equals(d): " + (!c.equals(d)));
        System.out.println("koniunkcja: " + (e && f));
        System.out.println("alternatywa: " + (e || f));
        System.out.println(!e);
        System.out.println(g);
        System.out.println(h);
        System.out.println(g);
        System.out.println(h);
    }
}