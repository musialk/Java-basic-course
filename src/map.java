import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String, String> whoWantWhat = new HashMap<>();

        whoWantWhat.put("Karol", "pizza");
        whoWantWhat.put("Roman", "burger");

        System.out.println(whoWantWhat);
        Set<String> keys = whoWantWhat.keySet();
        System.out.println(keys);

        Collection<String> values = whoWantWhat.values();
        System.out.println(values);
    }
}
