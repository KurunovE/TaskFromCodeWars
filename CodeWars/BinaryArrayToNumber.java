package CodeWars;

import java.util.List;

import static java.lang.Math.pow;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        final int SIZE = binary.size() - 1;
        int result = 0;

        for (int item = SIZE; item >= 0; item--){
            result += binary.get(item) * pow(2, (SIZE - item));
        }

        return result;
    }

}
