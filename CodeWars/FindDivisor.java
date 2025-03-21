package CodeWars;

public class FindDivisor {
    public static long numberOfDivision(int n) {
        long results = 0;

        for (int i = 1; i <= (int)Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                results += 1;

                if (n / i != i) {
                    results += 1;
                }
            }
        }

        return results;
    }
}
