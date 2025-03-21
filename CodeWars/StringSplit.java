package CodeWars;

public class StringSplit {
    public static String[] solution(String s) {

        final int SIZE = s.length();
        StringBuilder stringBuilder = new StringBuilder(s);

        if (SIZE % 2 != 0) {
            stringBuilder.append('_');
        }

        String[] result = new String[stringBuilder.length() / 2];

        int j = -1;
        for (int i = 0; i < result.length; i++) {
            j += 2;
            result[i] = String.valueOf(stringBuilder.charAt(j-1)) + String.valueOf(stringBuilder.charAt(j));
        }

        return result;
    }
}
