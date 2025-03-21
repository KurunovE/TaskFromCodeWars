package CodeWars;

import java.math.BigInteger;

import static java.lang.Integer.parseInt;

public class AllNines {
    public static BigInteger allNines(BigInteger x) {

        StringBuilder str = new StringBuilder(String.valueOf(x));
        int size = str.length();

        int bitChet = Integer.parseInt(String.valueOf(str.charAt(size - 1)));

        if (bitChet % 2 == 0){
            return new BigInteger("-1");
        } else {
            
        }

        return new BigInteger("0");
    }
}
