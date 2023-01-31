import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Zbyszek");
        names.add("Karolina");
        names.add("Michal");

        System.out.println("names: " + names);
        names.remove("Karol");
        Collections.sort(names);
        System.out.println("names: " + names);
    }
}
