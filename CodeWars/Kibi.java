package CodeWars;

import java.util.Arrays;

public class Kibi {
    public static final int KILO_MULTIPLIER = 1000;
    public static final int KIBI_MULTIPLIER = 1024;

    public static final String[] KILO_UNITS = {"B", "kB", "MB", "GB", "TB"};
    public static final String[] KIBI_UNITS = {"B", "KiB", "MiB", "GiB", "TiB"};

    public static String memorysizeConversion(String memorysize) {
        double v = Double.parseDouble(memorysize.split(" ")[0]);
        String unit = memorysize.split(" ")[1];
        if (unit.contains("i")) {
            int p = Arrays.asList(KIBI_UNITS).indexOf(unit);
            for (byte i = 0; i < p; i++) {
                v *= 1024 / 1000d;
            }
            unit = KILO_UNITS[p];
        } else {
            int p = Arrays.asList(KILO_UNITS).indexOf(unit);
            for (byte i = 0; i < p; i++) {
                v *= 1000 / 1024d;
            }
            unit = KIBI_UNITS[p];
        }
        return Math.round(v * 1000) / 1000d + " " + unit;
    }
}
