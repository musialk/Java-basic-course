import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Karol");
        names.add("Zbyszek");
        names.add("Zbyszek");
        names.add("Karolina");
        names.add("Michal");
        names.add("Michal");

        System.out.println(names);
        boolean result = names.isEmpty();
        System.out.println(result);
    }
}
