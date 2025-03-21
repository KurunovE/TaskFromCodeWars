package CodeWars;

public class IfSleepCountSheep {

    private static final String SEEP = " sheep...";

    public static String countingSheep(int num){

        StringBuilder countSheep = new StringBuilder();

        for (int item = 1; item <= num; item++){
            countSheep.append(item + SEEP);
        }

        return countSheep.toString();
    }
}
