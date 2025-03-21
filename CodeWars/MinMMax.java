package CodeWars;

public class MinMMax {
    public static int[] minMax(int[] arr) {
        int maxNum = arr[0];
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        return new int[]{minNum, maxNum};
    }
}
