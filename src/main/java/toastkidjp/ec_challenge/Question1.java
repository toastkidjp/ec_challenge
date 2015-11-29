package toastkidjp.ec_challenge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author Toast kid
 */
public class Question1 {
    public static void main(final String[] args) throws IOException {
        final Map<String, Integer> map = new HashMap<>();
        putAndIncrement(map, "Item B");
        putAndIncrement(map, "Item A");
        putAndIncrement(map, "Item C");
        putAndIncrement(map, "Item C");
        putAndIncrement(map, "Item C");
        putAndIncrement(map, "Item A");

        new TreeSet<String>(map.keySet()).stream().forEach(
             (key) -> System.out.println(String.format("%sÇ™%då¬Ç†ÇËÇ‹Ç∑ÅB", key, map.get(key).intValue()))
        );
    }
    private static void putAndIncrement(final Map<String, Integer> map, final String item) {
        map.put(item, map.containsKey(item) ? map.get(item) + 1 : 1);
    }
}
