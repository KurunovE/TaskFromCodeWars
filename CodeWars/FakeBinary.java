package CodeWars;

import static java.lang.Integer.parseInt;

public class FakeBinary {
    public static String fakeBin(String numberString) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++){
            int number = parseInt(String.valueOf(numberString.charAt(i)));

            if (number < 5){
                result.append(0);
            } else {
                result.append(1);
            }
        }

        return result.toString();
    }
}
