package CodeWars;

public class Solution {

    private static final String[] HOUR = {
            "midnight", "one", "two", "three",
            "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven",
            "twelve"
    };

    private static final String[] MINUTES = {
            "", "one minute", "two minutes", "three minutes",
            "four minutes", "five minutes", "six minutes",
            "seven minutes", "eight minutes", "nine minutes",
            "ten minutes", "eleven minutes", "twelve minutes",
            "thirteen minutes", "fourteen minutes", "quarter",
            "sixteen minutes", "seventeen minutes", "eighteen minutes",
            "nineteen minutes", "twenty minutes", "twenty one minutes",
            "twenty two minutes", "twenty three minutes", "twenty four minutes",
            "twenty five minutes", "twenty six minutes", "twenty seven minutes",
            "twenty eight minutes", "twenty nine minutes", "half"
    };

    public static String solve(String time) {
        int hour = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);

        if (hour == 0) {
            if (minutes == 0) {
                return HOUR[hour];
            } else {
                return (minutes <= 30)?
                        MINUTES[minutes] + " past " + HOUR[hour] :
                        MINUTES[Math.abs(minutes - 60)] + " to " + HOUR[hour + 1];
            }
        } else if (hour > 12) {
            if (minutes == 0) {
                return HOUR[hour % 12] + " o'clock";
            } else {
                return (minutes <= 30)?
                        MINUTES[minutes] + " past " + HOUR[hour % 12] :
                        MINUTES[Math.abs(minutes - 60)] + " to " + HOUR[(hour + 1) % 12];
            }
        } else {
            if (minutes == 0) {
                return HOUR[hour] + " o'clock";
            } else {
                if (hour == 11) {
                    return (minutes <= 30)?
                            MINUTES[minutes] + " past " + HOUR[hour] :
                            MINUTES[Math.abs(minutes - 60)] + " to " + HOUR[hour + 1];
                }
                return (minutes <= 30)?
                        MINUTES[minutes] + " past " + HOUR[hour] :
                        MINUTES[Math.abs(minutes - 60)] + " to " + HOUR[(hour + 1) % 12];
            }
        }
    }
}
