package CodeWars;

import java.util.HashSet;


public class CircleOfChildren {
    public static int[] distributionOfCandy(int[] candies) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int candy: candies) {
            hashSet.add(candy);
        }

        boolean isTrue = hashSet.size() == 1;

        while (!isTrue) {
            hashSet.clear();

            int[] temp = new int[candies.length];

            for (int i = 0; i <= temp.length; i++) {
                if (candies[i] % 2 == 0) {
                    
                } else {

                }
            }

        }

        return new int[2];
    }
}
