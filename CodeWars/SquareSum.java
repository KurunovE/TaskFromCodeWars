package CodeWars;

public class SquareSum {
    public static int squareSum(int[] n) {

        final int SIZE = n.length;
        int sqrtSum = 0;

        for (int i = 0; i < SIZE; i++){
            sqrtSum += Math.pow(n[i], 2);
        }

        return sqrtSum;
    }
}
