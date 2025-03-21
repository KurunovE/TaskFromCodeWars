package CodeWars;

import java.util.List;

import static java.lang.Integer.parseInt;

public class MixedSum {
    public int sum(List<?> mixed) {
        int result = 0;

        for (Object item: mixed){
            String number = String.valueOf(item);
            result += parseInt(number);
        }
        return result;
    }
}

