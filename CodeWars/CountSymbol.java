package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CountSymbol {
    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char key = str.charAt(i);
            boolean flag = result.containsKey(key);

            if (flag) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }

        }
        return result;
    }
}
