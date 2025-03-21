package CodeWars;

import java.util.ArrayList;

public class JomoPipi {
    public static int[] mutationLocation(char[][] body) {

        char[] firstDNK = body[0];

        for (int i = 1; i < body.length; i++) {
            for (int j = 0; j < body[i].length; j++) {
                if (body[i][j] != body[i - 1][j]) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];
    }
}
